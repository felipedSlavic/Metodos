package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

    static Scanner entrada = new Scanner(System.in);

    static int [] arrayQuant = new int[5];

    static DecimalFormat formataMoeda = new DecimalFormat("R$ ### 0.00");

    public static void main(String[] args) {

        // Dados Iniciais (VAR)

        String[] arrayModeloCarro  = new String[]{"Classic","Cobalt","Onix","Prisma","Cruze"};
        double [] arrayPrecos = new double[]{33600,44900,37790,43150,55400};

        System.out.println();
        System.out.println("CONTROLE DE VENDAS VIGORITO");
        System.out.println();



        //CHAMADAS
        // A
        int [][] matrizQtdVendas = quantidadeVendas(arrayModeloCarro);
        // C
        relatorioGerencial(arrayModeloCarro,arrayPrecos,matrizQtdVendas);






    }  // Fecha Main


    public static int [][]quantidadeVendas (String [] arrayModeloCarro){

        int [][] matrizQtdVendas = new int[4][5];

        System.out.println("--- Vendas por Trimestre ");
        System.out.println();

        for (int linha = 0; linha < 4; linha ++){
            System.out.println();
            System.out.println("Vendas " + (linha+1) + "° Trimestre");
            System.out.println();
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Vendas do Carro Chevrolet " + (arrayModeloCarro[coluna]) + ": ");
                matrizQtdVendas[linha][coluna]= entrada.nextInt();
            }
        }

        return matrizQtdVendas;

    }

    
    public static double [] valorTotalVendasPorCarro (int [][] matrizQtdVendas, double [] arrayPrecos){
        
        double [] arrayTotalVendasTrimestre = new double[5];

        for (int coluna = 0; coluna < 5; coluna++) {
            for (int linha = 0; linha < 4; linha++) {
                arrayQuant[coluna] += matrizQtdVendas[linha][coluna];
            }
            arrayTotalVendasTrimestre[coluna] = arrayQuant[coluna] * arrayPrecos[coluna];
        }

        
        return arrayTotalVendasTrimestre;
        
    }

    public static void relatorioGerencial (String [] arrayModeloCarro, double[] arrayPrecos, int[][] matrizQtdVendas){

        // B
        double []arrayTotalVendasTrimestre = valorTotalVendasPorCarro(matrizQtdVendas,arrayPrecos);

        double totalGeral = 0;

        System.out.println();
        System.out.println("--- RELATÓRIO GERENCIAL VIGORITO");
        System.out.println();

        for (int contador = 0; contador < 5; contador++) {
            totalGeral += arrayTotalVendasTrimestre[contador];

            System.out.println("Carro: Chevrolet " + arrayModeloCarro[contador] + "\t" + "Quantidade Geral: "
            + arrayQuant[contador] + "\t" + "Total: " + formataMoeda.format(arrayTotalVendasTrimestre[contador]));
        }
        System.out.println();
        System.out.println("Total Geral de Vendas em 2014 : " + formataMoeda.format(totalGeral));



    }












}
