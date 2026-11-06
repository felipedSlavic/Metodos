package exercicios;

import java.util.Scanner;

public class exercicio04 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        //Chamada de A)
        int [][] chamados = carregar();
        // Chamada de B)
        verificaErros(chamados);
        // Chamada C)
         int[] qtdeCriterios = verificaCriterios(chamados);

        System.out.println("------- RELATÓRIO CRITÉRIOS ------");
        for (int i = 0; i < 4; i++) {
            System.out.println("Quantidade Erros no Critério " + (i+1) + " : " + qtdeCriterios[i]);
        }

    }






    public static int [][] carregar(){

        int [][] chamados = new int [5][3];

        for (int linhas = 0; linhas < 5; linhas++){
            System.out.print("Digite o Id do funcionário : ");
            chamados[linhas][0]=entrada.nextInt();
            //Validação 1,2,3

            System.out.print("Digite o Código do Erro : ");
            chamados[linhas][1]=entrada.nextInt();
            while (chamados[linhas][1] < 0 || chamados[linhas][1] > 3){
                System.out.print("Digite um Código de Erro VÁLIDO : ");
                chamados[linhas][1] = entrada.nextInt();
            }
            //Validação 1,2,3.4

            System.out.print("DIgite o Código do Critério : ");
            chamados[linhas][2]=entrada.nextInt();
            while (chamados[linhas][2] < 0 || chamados[linhas][2] > 4){
                System.out.print("Digite um Código de Critério VÁLIDO : ");
                chamados[linhas][2] = entrada.nextInt();
            }
            System.out.println();
        }

        return chamados;
    }

    public static void verificaErros(int[][] chamados){

        int[]erros = new int[3];

        for (int i = 0; i < 5; i++) {
            if (chamados[i][1]==1){
                erros[0]++;
            } else if (chamados[i][1]==2){
                erros[1]++;
            } else {
                erros[2]++;
            }
        }


        System.out.println();
        System.out.println("------- Relatório de Erros --------");
        for (int i = 0; i < 3; i++) {
            System.out.println("Números de Chamado com o Código de Erro " + (i+1) + " : " + erros[i]);
        }
        System.out.println();
    }


    public static int[] verificaCriterios(int[][] chamados){
        int[] qtdeCriterios = new int[4];

        for (int linhas = 0; linhas < 5; linhas++) {
            if (chamados[linhas][2]==1){
                qtdeCriterios[0]++;
            } else if (chamados[linhas][2] == 2) {
                qtdeCriterios[1]++;
            } else if (chamados[linhas][2] == 3) {
                qtdeCriterios[2]++;
            } else {
                qtdeCriterios[3]++;
            }
        }
        return qtdeCriterios;
    }

}
