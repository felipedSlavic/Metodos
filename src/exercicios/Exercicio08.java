package exercicios;

import java.util.Scanner;

public class Exercicio08 {

    static Scanner entrada = new Scanner(System.in);

    static String [] pilotos = new String[]{"Max Verstappen","Lando Norris","Charles Leclerc","Lewis Hamilton","George Russell"};


    public static void main(String[] args) {

        String [] paises = new String[]{"Bélgica","Itália","Cingapura","Malásia","Japão"};

        relatorioGerencial(paises);

    }

// A
    public static void relatorioGerencial (String[] paises){

        // B
        double [][] pontuacao = pontuacaoPorGp(paises);

        // C
        double [] somaPontos = verificaPts(pontuacao);

        // D
       String [] pilotoVencedor = vencedor(pontuacao);

       // E
        ranking(somaPontos);
    }

    public static double[][] pontuacaoPorGp (String [] paises){

        double[][] pontuacao = new double[5][5];

        System.out.println();
        System.out.println("-- CAPTAÇÃO DE PONTOS");
        System.out.println();

        for (int piloto = 0; piloto < 5; piloto++) {
            System.out.println();
            System.out.println("Piloto : " + pilotos[piloto]);
            System.out.println();
            for (int gp = 0; gp < 5; gp++) {
                System.out.print("-Pontuação GP " + paises[gp] + ": ");
                pontuacao[piloto][gp]= entrada.nextDouble();
            }
        }

        return pontuacao;
    }

    public static double [] verificaPts (double[][] pontuacao){

        double [] somaPontos = new double[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaPontos[i] += pontuacao[i][j];
            }

        }

        return somaPontos;
    }

    public static String [] vencedor (double[][] pontuacao){

        String [] pilotoVencedor = new String[5];
        double maior = 0;
        int indicePiloto = 0;

        for (int gp = 0; gp < 5; gp++) {
            for (int piloto = 0; piloto < 5; piloto++) {
                if (pontuacao[piloto][gp] > maior) {
                    maior = pontuacao[piloto][gp];
                    indicePiloto = piloto;
                }
            }
            pilotoVencedor[gp] = pilotos[indicePiloto];
            maior = 0;
            System.out.println();
            System.out.println(pilotoVencedor[gp]);
        }
            return pilotoVencedor;
    }

    public static void ranking (double [] somaPontos){

        double maior = 0;
        String vencedor = "";

        for (int i = 0; i < 5; i++) {
            if (somaPontos[i] > maior){
                maior = somaPontos[i];
                vencedor = pilotos[i];
            }
        }

        System.out.println("O Vencedor foi " + vencedor + " com " + maior + " pontos");
      

    }




}
