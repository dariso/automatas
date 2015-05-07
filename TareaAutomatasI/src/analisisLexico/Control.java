package analisisLexico;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Control {
	
	//private int[][] resultados;
	private String dir;
	private Scanner scanner;
	
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
				salir = true;
			}
			else{
				System.out.println("Problema de path,digite de nuevo");
			}
		}
	}
			
	void revisarArchivos(){
		try {
			Files.walkFileTree(Paths.get(dir), new SimpleFileVisitor<Path>() {
			    @Override
			    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			        System.out.println("file: " + file);
			        return FileVisitResult.CONTINUE;
			    }
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args){
		System.out.println("Hello World");
		Control c = new Control();
		c.setDirectorio();
		c.revisarArchivos();
	}
}
