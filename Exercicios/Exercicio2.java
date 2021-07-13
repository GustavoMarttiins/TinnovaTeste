package Exercicios;

public class Exercicio2 {

	public static void main(String[] args) {

		/**
		 * O exercício consiste em organizar a sequência dos vetores, utilizando a
		 * tecnica de Bubble Sort.
		 * @author Gustavo Martins de Souza
		 */

		int troca, vetor[] = { 5, 3, 2, 4, 7, 1, 0, 6 };
		boolean comando;

		for (int i = 0; i < vetor.length; i++) {
			comando = true;
			for (int j = 0; j < (vetor.length - 1); j++) {

				if (vetor[j] > vetor[j + 1]) {
					troca = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = troca;
					comando = false;
				}
			}
			if (comando) {
				break;
			}
		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + "");
		}

	}
}
