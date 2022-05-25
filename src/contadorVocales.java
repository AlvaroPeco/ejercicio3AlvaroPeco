
public class contadorVocales {

	public static void main(String[] args) {
		String array [] = {"Ana", "Luis", "Antonio", "Manuel"};
		contarVocales (array);

	}
	
	public static void contarVocales (String array []) {
		String a="a";
		String e="e";
		String i="i";
		String o="o";
		String u="u";
		char posicion = 0;
		
		for (int j=0; j<array.length; j++) {
			posicion=array[j].charAt(j);
		}
		
		System.out.println(posicion);
	}

}
