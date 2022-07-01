package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		String black = null;
		String blue = null;
		Gato gato = new Gato(blue, black, 3);
		
		Livro livro = new Livro();
		System.out.println(gato);
		System.out.println(livro);

		
		
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World " + (a+b));*/
	}

}

//local variable
class Livro {
	private String nome;
	private String npag;
}
