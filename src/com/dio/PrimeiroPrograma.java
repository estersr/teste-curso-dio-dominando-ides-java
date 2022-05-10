package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();	
		Livro livro = new Livro();
		
		
		System.out.printIn(gato);
		System.out.printIn(livro);
		/*
		 * ctrl + shft + o = importar
		 * ctrl shift f = identar
		 * ctlr 3 genetare
		 *  
		 * int a = 1; int b = 2;
		 * System.out.println("Hello World " + (a+b));
		 */

	}

}

class Livro {
	private String nome;
	private String npag;

}