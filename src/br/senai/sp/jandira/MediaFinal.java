package br.senai.sp.jandira;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nome do aluno:");
		String nome = teclado.nextLine();
		
		System.out.println("Nota do Bimeste 1:");
		double b1 = teclado.nextDouble();
		
		System.out.println("Nota do Bimeste 2:");
		double b2 = teclado.nextDouble();
		
		System.out.println("Nota do Bimeste 3:");
		double b3 = teclado.nextDouble();
		
		System.out.println("Nota do Bimeste 4 ");
		double b4 = teclado.nextDouble();
		
		double resultado = (b1+b2+b3+b4)/4;
		
		System.out.println("------------------------------------");
		System.out.println("            MEDIA FINAL             ");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println("Nome do aluno: " + nome );
		System.out.println("Nota do bimestre 1: " + b1 );
		System.out.println("Nota do bimestre 2: " + b2 );
		System.out.println("Nota do bimestre 3: " + b3 );
		System.out.println("Nota do bimestre 4: " + b4 );
		System.out.println("");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println( nome + ", a sua nota final é "+ resultado);
		System.out.println("");
		System.out.println("------------------------------------");
		
	}

}
