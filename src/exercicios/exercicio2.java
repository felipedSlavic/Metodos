package exercicios;

import java.util.Scanner;

public class exercicio2 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int codigoCaminhao = 0;
        double carga = 0;



        System.out.println("TRANSPORTADORA EXPRESS");
        System.out.println();

        System.out.print("Código do Caminhão: ");
        codigoCaminhao = entrada.nextInt();
        System.out.print("Carga do Caminhão em Toneladas: ");
        carga = entrada.nextDouble();

        // Chamada Função A)
        double precoCarga = calculaPreco(carga);
        System.out.println("Valor da Carga: " + precoCarga);

        // Chamada Função B)
        double imposto = calculaImposto(precoCarga);

        // Valor Total
        System.out.println(" Valor Total " + (precoCarga + imposto));

    } // main


    public static double calculaPreco(double carga){
        int codigoCarga = 0;
        double precoCarga = 0, converteCarga = 0;

        converteCarga = carga*1000;

        System.out.println("Digite o Código da Carga : ");
        codigoCarga = entrada.nextInt();

        while (codigoCarga < 1 || codigoCarga > 30){
            System.out.println("Digite um Código Válido ( De 1 a 30) : ");
            codigoCarga = entrada.nextInt();
        }

            if (codigoCarga >= 1 && codigoCarga <= 10){
                precoCarga = 120 * converteCarga;
            } else if (codigoCarga >= 10 && codigoCarga  <= 20) {
                precoCarga = 200 * converteCarga;
            } else  {
                precoCarga = 200 * converteCarga;
            }
            return precoCarga;

    } // fecha funcao A)

    public static double calculaImposto(double precoCarga){
        int codigoEstado = 0;
        double imposto = 0;

        System.out.println("Digite o Código do Estado : ");
        codigoEstado = entrada.nextInt();

        while (codigoEstado< 1 || codigoEstado > 4){
            System.out.println("Digite um Código de Estado Válido ( De 1 a 4) : ");
            codigoEstado = entrada.nextInt();
        }

        switch (codigoEstado){
            case 1: imposto = precoCarga * 1.25;
            break;
            case 2: imposto = precoCarga * 1.20;
            break;
            case 3: imposto = precoCarga * 1.15;
            break;
            case 4: imposto = 0;
            break;
        }

        return imposto;

    }
}
