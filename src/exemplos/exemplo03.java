package exemplos;

import java.util.Scanner;

public class exemplo03 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0, n1 = 0, n2 = 0;

        while (opcao !=5) {

            System.out.println(" 1 - Adição");
            System.out.println(" 2 - Subtração");
            System.out.println(" 3 - Multiplicação");
            System.out.println(" 4 - Divisão");
            System.out.println(" 5 - Sair");


            System.out.println("Digite a Opção Desejada: ");

            opcao = entrada.nextInt();
            if (opcao > 0 && opcao < 5){
                System.out.println("Digite o n1: ");
                n1 = entrada.nextInt();
                System.out.println("Digite o n2: ");
                n2 = entrada.nextInt();
            }



            switch (opcao) {
                case 1: adicao(n1,n2); //Parametros Reais
                    break;
                case 2: subtracao(n1,n2);
                    break;
                case 3: multiplicacao(n1,n2);
                    break;
                case 4: divisao(n1,n2);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }


    } //Main


    public static void adicao(int n1, int n2) {
        int  r = 0;
        System.out.println("Operação Adição");
        r = n1 + n2;
        System.out.print("Resultado: " + r);
        System.out.println();

    } // adicao


    public static void subtracao(int n1, int n2) {
       int  r = 0;
        System.out.println("Operação Subtração");
        r = n1 - n2;
        System.out.print("Resultado: " + r);
        System.out.println();

    }


    public static void multiplicacao(int n1, int n2) {
        int r = 0;
        System.out.println("Operação Multiplicação");
        r = n1 * n2;
        System.out.print("Resultado: " + r);
        System.out.println();
    }

    public static void divisao(int n1, int n2) {
        int r = 0;
        System.out.println("Operação Divisão");
        r = n1 / n2;
        System.out.print("Resultado: " + r);
        System.out.println();
    }
}
