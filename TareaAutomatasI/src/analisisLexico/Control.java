package analisisLexico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
	private String dir;
	private Scanner scanner;
    private AnalizadorLexico analizador;
	
	Control(){
		scanner = new Scanner(System.in);
	
	}
	
	void setDirectorio(){
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
        
        void analisis(File file) throws FileNotFoundException, IOException{
            
            AnalizadorL analizador = new AnalizadorL( new java.io.FileReader(file) );
            resultadoA = analizador.analyze();
            System.out.print("Nombre de Archivo "+ nombres[indice]+ " ");
            for(int i=0;i<12;i++){
                 System.out.print(resultadoA[i]);
             }
            System.out.println("");
             
        }
			
	void revisarArchivos(){
            
	    try {
                        Files.walkFileTree(Paths.get(dir), new SimpleFileVisitor<Path>() {
			    @Override
			    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
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
	        Control c = new Control();
		c.setDirectorio();
		c.revisarArchivos();
	}
}
