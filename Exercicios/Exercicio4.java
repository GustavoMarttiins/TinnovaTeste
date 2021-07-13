package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		/**
		 * O programa consiste em calcular a soma dos multiplos de 3 ou 5.
		 * @author Gustavo Martins de Souza
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número que deseja realizar o teste: ");
		
		int num, x = 3,  y = 5, resp = 0;
		
		num = sc.nextInt();


		for(int i = 0; i < num; i++){
		    if(i % x == 0 || i % y == 0){
		        resp += i;
		    }
		}

		System.out.println("A soma dos multiplos de 3 e 5 é: " +resp);
	}

}
