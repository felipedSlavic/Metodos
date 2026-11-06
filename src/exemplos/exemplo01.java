package exemplos;

import java.util.Scanner;

public class exemplo01 {

    //Scanner Global; Todos os metódos podem utilizar
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        //Chamada de Procedimento
        verifica();

    } // main

    //PROCEDIMENTO

    public static void verifica(){

        int num = 0;

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println("Número Par");
        } else {
            System.out.println("Número Impar");
        }


    } // verifica


}
