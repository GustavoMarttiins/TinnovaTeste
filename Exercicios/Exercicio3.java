package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	/**
	 * O programa consiste em calcular valores fatorial de um número qualquer.
	 * @author Gustavo Martins de Souza
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, numFatorial = 1;

		System.out.println("Por favlor, informe o número que deseja " + "calcular o fatorial:\n");
		num = sc.nextInt();

		if (num >= 0) {
			for (int i = 1; i <= num; i++) {
				numFatorial = numFatorial * i;
			}
			System.out.println("O valor de fatorial é: " + numFatorial);
		} else {
			System.out.println("Por favor, informe números maiores ou igual a zero!");

		}
	}
}
