package controller;

public class VetorController {
	public VetorController() {
		super();
	}

	public int FVetorMenor(int[] Vet, int tamanho, int menor) {
		//Condição de parada --> Quando o vetor acabar, ou seja, quando o indice for menor que zero.
		if (tamanho < 0) {
			return menor;
		}
		
		if (menor >= Vet[tamanho]) {
			menor = Vet[tamanho];
		}

		tamanho -= 1;
		return FVetorMenor(Vet, tamanho, menor);
		/*
         * A chamada dos processos ocorre da seguinte forma:
         *
         * A função recebe os parametros: O conteúdo do vetor, o seu tamanho e o menor número encontrando que é o ultimo valor do indice;
         * E então, a função percorre todo o vetor, independente se ele encontrar o menor valor ou não. Porém, quando ele encontra
         * um valor no vetor na posição atual, que é menor que o valor da variável "menor", então o valor da variável é substituído
         * e então a função faz uma nova chamada, até chegar na condição de parada, onde o tamanho do vetor é diminuído a cada nova
         * chamada de função.
		 */
	}
}
