package exemplos;

import java.util.Scanner;

public class exemplo04 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {


        double salario = 0;
        int tempo = 0 ;

        System.out.print("Digite o Salário: ");
        salario = entrada.nextDouble();
        System.out.print("Digite o Tempo de casa: ");
        tempo = entrada.nextInt();

        // Chamada da Função
        //Retorna um valor e precisa ser armazenado
        String status = verifica(salario,tempo);
        System.out.println("Status: " + status);

    } //Main

    //Função

    public static String verifica(double salario, int tempo){
        String status;

        if (salario < 2500 && tempo > 5){
            status = "Tem Direito ao Reajuste Salarial";
        } else {
            status = "Não tem Direito ao Reajuste Salarial";
        }

        return status;
    }


}
