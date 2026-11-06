package exercicios;

import java.util.Scanner;

public class exercicio01 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String nome;
        int acomodacao = 0, quantidadeDiarias = 0;
        double precoDiaria = 0;

        System.out.println();
        System.out.println("POUSADA BEIRA MAR");
        System.out.println();

        System.out.println("------ DADOS DE ENTRADA ------ ");
        System.out.println();
        System.out.print("Digite o seu Nome: ");
        nome = entrada.next();
        System.out.print("Digite o Tipo de Acomodação - ( 1 - Standard, 2 - Luxo, 3 - Super Luxo ) : ");
        acomodacao = entrada.nextInt();

        while (acomodacao < 1 || acomodacao > 3){
            System.out.print("Por Favor, Digite uma Acomodação Válida (1,2 ou 3) : ");
            acomodacao = entrada.nextInt();
        }

        switch (acomodacao)  {
            case 1:precoDiaria = 380;
            break;
            case 2: precoDiaria = 450;
            break;
            case 3: precoDiaria = 560;
            break;
        }

        System.out.print("Digite a Quantidade de Diárias: ");
        quantidadeDiarias = entrada.nextInt();

        // Chamar Função Calcula

        double precoEstadia = calcula(quantidadeDiarias,precoDiaria);

        // Saida Função

        System.out.println();
        System.out.println("Preço Total da Estádia: " + precoEstadia);
        System.out.println();

        // Chama Procedimento

        formaPagamento(precoEstadia);



    } // Main


    //Função

    public static double calcula(int quantidadeDiarias, double precoDiaria){
        double precoEstadia = 0;
        precoEstadia = quantidadeDiarias * precoDiaria;
        return precoEstadia;
    } // fim funcao



    public static void formaPagamento(double precoEstadia){

        char tipoPagamento;
        double valorFinal= 0;
        System.out.println();
        System.out.println("Digite a Forma de Pagamento ( À Vista (V) ou A Prazo (P) : ");
        tipoPagamento=entrada.next().toUpperCase().charAt(0);

        while (tipoPagamento != 'V' && tipoPagamento != 'P'){
            System.out.print("Por Favor, Digite uma Forma de Pagamento Válida (V,P) : ");
            tipoPagamento=entrada.next().toUpperCase().charAt(0);
        }

        if (tipoPagamento == 'V' ) {
          valorFinal = precoEstadia * 0.90;
        }

        System.out.println("PREÇO FINAL : " + valorFinal);


        } // fecha procedimento

}
