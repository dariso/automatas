package analisisLexico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Control {
	private static int indice = 0;
        
	private int[][] resultados;
    private int[] resultadoA;
    private String[] nombres;
    private String[] compLex;
    private String dir;
	private Scanner scanner;
    private AnalizadorLexico analizador;
    private AnLexFactory fabricaAnalizaLexicos;
	
	Control(AnLexFactory fabricaAL){
		scanner = new Scanner(System.in);
		fabricaAnalizaLexicos = fabricaAL;
	
	}
	
	private void analisis(File file) throws FileNotFoundException, IOException{
        
		   analizador = fabricaAnalizaLexicos.getAnalizadorLexico(file);
		   resultadoA = analizador.analyze();
	       System.out.print("Nombre de Archivo "+ nombres[indice]+ " ");
	       for(int i=0;i<12;i++){
	    	   System.out.print(resultadoA[i]);
	    	   resultados[indice][i] = resultadoA[i];
	       }
	      System.out.println("");
    }
	
	public void printResultados(){
		compLex = analizador.getNombreCompLexicos();
		PrintWriter writer;
		try {
			writer = new PrintWriter("Resultados.txt");
			writer.print("          ");
			for(String componente : compLex){
				writer.print(componente + "     ");
			}
			writer.println();
			for(int i=0;i<nombres.length;i++){
				writer.print(nombres[i]+"	  ");
				for(int j=0;j<12;j++){
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
		System.out.println("Digite el path del Directorio");
		while(!salir){
			dir = scanner.next();
			file = new File(dir);
			if(file.exists()){
				int len = file.listFiles().length;
                //12 componentes Lexicos
				resultados = new int[len][12];
                nombres = new String[len]; 
                salir = true;
                                
			}
			else{
				System.out.println("Problema de path,digite de nuevo");
			}
		}
	}
        
   
			
	public void revisarArchivos(){
		try {
			Files.walkFileTree(Paths.get(dir), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) 
					throws IOException {
				System.out.println("file: " + file);
                File archivo = new File(file.toString());
                nombres[indice] = archivo.getName();
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
	}
}
