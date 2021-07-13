package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	/**
	 * O exerc�cio consiste em mostrar o percentual de votos: v�lidos, votos em
	 * branco e votos nulos.
	 * @author Gustavo Martins de Souza
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int totalEleitores, validos, brancos, nulos;
		double percValidos, percBranco, percNulos;

		System.out.printf("Por favor, informe o n�meros de eleitores:\n");
		totalEleitores = sc.nextInt();

		System.out.printf("Por favor, informe o n�meros de votos val�dos:\n");
		validos = sc.nextInt();

		System.out.printf("Por favor, informe o n�meros de votos em branco:\n");
		brancos = sc.nextInt();

		System.out.printf("Por favor, informe o n�meros de votos nulos:\n");
		nulos = sc.nextInt();

		percValidos = ((double) validos / totalEleitores) * 100;
		percBranco = ((double) brancos / totalEleitores) * 100;
		percNulos = ((double) nulos / totalEleitores) * 100;

		System.out.printf("\n\n%6.2f%% de votos validos.", percValidos);
		System.out.printf("\n%6.2f%% de votos em branco.", percBranco);
		System.out.printf("\n%6.2f%% de votos nulos.\n", percNulos);
	}
}
