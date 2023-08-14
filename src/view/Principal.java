package view;

import controller.VetorController;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		int[] Vetor = new int[10];
		Random r = new Random();
		int tamanho = (Vetor.length - 1);

		for(int i=0;i<=tamanho;i++){
			Vetor[i] = r.nextInt(1,30); //Numero aleatórios entre 1 e 30
		}

		int menor = Vetor[tamanho];

		VetorController vet = new VetorController();

		int res = vet.FVetorMenor(Vetor, tamanho, menor);

		System.out.println("Menor valor do vetor: "+res);

	}

}
