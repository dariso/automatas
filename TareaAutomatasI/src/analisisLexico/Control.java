/*
 * Tarea I Automatas
 * Daniel Rivera Solano A85274
 *
 * */



package analisisLexico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Control {
	private int indice = 0;
    private int[][] resultados;
    private int[] resultadoAnalisis;
    private String[] nombresArchivos;
    private String[] nombresCompLexicos;
    private String dir;
	private Scanner scanner;
    private AnLexFactory fabricaAnalizaLexicos;
    private AnalizadorLexico analizador;
	
	Control(AnLexFactory fabricaAL){
		scanner = new Scanner(System.in);
		fabricaAnalizaLexicos = fabricaAL;
	
	}
	
	private void analisis(File file) throws FileNotFoundException, IOException{
		
		   analizador = fabricaAnalizaLexicos.getAnalizadorLexico(file);
		   if(resultados == null){
			   resultados = new int [nombresArchivos.length][analizador.getNombreCompLexicos().length];
		   }
		   if(nombresCompLexicos == null){
			   nombresCompLexicos = analizador.getNombreCompLexicos();
		   }
		   resultadoAnalisis = analizador.analyze();
	       for(int i=0;i<analizador.getNombreCompLexicos().length;i++){
	    	   resultados[indice][i] = resultadoAnalisis[i];
	       }
	      
    }
	
	public void printResultados(){
		PrintWriter writer;
		try {
			writer = new PrintWriter("Resultados.txt");
			writer.print("          ");
			for(String componente : nombresCompLexicos){
				writer.print(componente + "     ");
			}
			writer.println();
			for(int i=0;i<nombresArchivos.length;i++){
				writer.print(nombresArchivos[i]+"	  ");
				for(int j=0;j<nombresCompLexicos.length;j++){
					writer.print(resultados[i][j] + "          ");
				}
				writer.println("\n");
			}
					
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void setDirectorio(){
		boolean salir = false;
		File file;
		System.out.println("Digite la Direccion del Directorio a Analizar");
		while(!salir){
			dir = scanner.next();
			file = new File(dir);
			if(file.exists()){
				int len = file.listFiles().length;
                //12 componentes Lexicos
			    nombresArchivos = new String[len]; 
                salir = true;
                                
			}
			else{
				System.out.println("Direccion Invalida,Digitela De Nuevo");
			}
		}
	}
        
   
			
	public void revisarArchivos(){
		try {
			Files.walkFileTree(Paths.get(dir), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) 
					throws IOException {
				File archivo = new File(file.toString());
                nombresArchivos[indice] = archivo.getName();
                analisis(archivo);
                indice++;
                return FileVisitResult.CONTINUE;
			    }
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args){
		AnLexFactory fabrica = new AnLexFactory(); 
	    Control c = new Control(fabrica);
		c.setDirectorio();
		c.revisarArchivos();
		c.printResultados();
		System.out.println("Analisis Finalizado, Resultados guardados en archivo Resultados.txt\n"
				+ "creado en la misma carpeta del ejectutable.");
	}
}
