package analisisLexico;



public interface AnalizadorLexico {
	
	
	public int[] analyze();
	//cada analizador lexico conoce el nombre de los componentes que revisa, para las impresiones de resultados.
	public String[] getNombreCompLexicos();

}
