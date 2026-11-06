package exemplos;

import java.util.Scanner;

public class exemplo05 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        double gs = 0, sprint = 0, checkPoint = 0;

        System.out.println("Método Principal");
        System.out.println();
        System.out.print("Digite a Nota da GS: ");
        gs = entrada.nextDouble();
        System.out.print("Digite a Nota do Sprint: ");
        sprint = entrada.nextDouble();
        System.out.print("Digite a Nota do CheckPoint: ");
        checkPoint = entrada.nextDouble();

        // Chamada da Função Média

        double media = calcula(gs, sprint, checkPoint);
        System.out.println();
        System.out.println("Média: " + media);
        System.out.println();

        //Chamada Procedimento Analisa

        analisa(media);

    } // main

    //Função
    public static double calcula(double gs, double sprint, double checkPoint) {
        double media = 0;
        media = (gs + sprint + checkPoint) / 3;
        return media;
    } // function


    public static void analisa(double media) {
        if (media >= 6){
            System.out.println("Aprovado - Média: " + media);
        } else if (media >= 4) {
            System.out.println("Exame - Média: " + media);
        } else {
            System.out.println("DP - Média: " + media);
        }
    }

}
