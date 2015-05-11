package analisisLexico;

import java.io.File;
import java.io.FileNotFoundException;

public class AnLexFactory {
	
	public AnalizadorLexico getAnalizadorLexico(File file) throws FileNotFoundException{
		return new AnalizadorL(new java.io.FileReader(file));
	}
}
