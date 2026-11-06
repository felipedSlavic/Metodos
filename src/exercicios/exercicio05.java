package exercicios;

import java.util.Scanner;

//(REVISAR))


public class exercicio05 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int [] vetorA = entradaVetor();
        ordenaVetor(vetorA);
        System.out.println();
        System.out.println("---- Números Ordenados  ----");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetorA[i]);
        }
    }

//Entrada de Valores

    public static int[] entradaVetor(){

         int [] vetorA = new int[5];

        System.out.println("---- CARREGAR O VETOR -----");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "° Número : ");
            vetorA[i]=entrada.nextInt();
        }

        return vetorA;
    }


// Metódo para Receber e Ordenar

    public static int[] ordenaVetor(int [] vetorA){

        int aux = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {

                if (vetorA[j] > vetorA[j+1]){
                    aux = vetorA[j];
                    vetorA[j]=vetorA[j+1];
                    vetorA[j+1]=aux;
                }
            }

        }

        return vetorA;
    }

}
