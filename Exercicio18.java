package aula19_Arrays;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		/*
		 * Ler um vetor A com 10 elementos inteiros correspondentes as idades de um
		 * grupo de pessoas. Escreva um programa que determine e escreva a menor e a
		 * maior idade e suas respectivas posições.
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorIdade = new int[10];

		for (int x = 0; x < vetorIdade.length; x++) {
			System.out.println("Digite a idade da posicao: " + (x + 1));
			vetorIdade[x] = ler.nextInt();
		}
		int maiorIdade = vetorIdade[0];
		int menorIdade = vetorIdade[0];
		int maiorPosicao = 0;
		int menorPosicao = 0;

		for (int x = 0; x < vetorIdade.length; x++) {
			if (vetorIdade[x] > maiorIdade) {
				maiorIdade = vetorIdade[x];
				maiorPosicao = x;
			} else if (vetorIdade[x] < menorIdade) {
				menorIdade = vetorIdade[x];
				menorPosicao = x;
			}
		}
		System.out.println("Menor idade: " + menorIdade);
		System.out.println("Menor posicao: " + menorPosicao);
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Maior posicao: " + maiorPosicao);
	}
}
