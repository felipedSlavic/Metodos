package exercicios;

import java.util.Scanner;

public class exercicio06 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        // DADOS DE ENTRADA :

        String[] produtos = new String[]{"Notebook","Computadores","Tablets","Servidores"};
        double[] metaVendas = new double[]{100,150,200,250};

        // Chamada a)
        double[][] matrizVendas = vendas(produtos);
        // Chamada b)
        double [] vetorSomaProd = somaProutos(matrizVendas,produtos);
        // Chamada c)
        double [] vetorSomaTri = somaTrimestre(matrizVendas);


    }


    // Primeiro Método Função A

    public static double[][] vendas(String[] produtos ){


        double [][] matrizVendas = new double[4][3];

        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.println("---- " + (i+1) + "° Trimestre -----");
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a quantidade de " + produtos[j] + " vendidos : "  );
                matrizVendas[j][i]=entrada.nextDouble();
            }
        }

        return matrizVendas;
    }

    public static double[] somaProutos(double[][] matrizVendas, String[] produtos){

        double [] vetorSomaProd = new double[4];

        System.out.println();
        System.out.println("---- Total de Vendas por Produto ----");
        System.out.println();


        for (int linhas = 0; linhas < 4; linhas++) {
            for (int colunas = 0; colunas < 3; colunas++) {
                vetorSomaProd[linhas]+=matrizVendas[linhas][colunas];
            }

            System.out.println("Número de Vendas do Produto - " + produtos[linhas] + " - " + vetorSomaProd[linhas]);
        }


            return vetorSomaProd;
    }

    public static double [] somaTrimestre(double[][] matrizVendas){

        double[] vetorSomaTri = new double[3];

        System.out.println();
        System.out.println("---- Total de Vendas por Trimestre ----");
        System.out.println();

        for (int colunas = 0; colunas < 3; colunas++) {
            for (int linhas = 0; linhas < 4; linhas++) {
                vetorSomaTri[colunas]+=matrizVendas[linhas][colunas];
            }
            System.out.println("Número de Vendas Totais do " + (colunas+1) + "° Trimestre : " + vetorSomaTri[colunas]);
        }


        return vetorSomaTri;

    }




}
