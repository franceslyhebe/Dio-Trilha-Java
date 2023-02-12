package edu.java.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("==========================" +
                            "\nTABUADA" +
                            "\n==========================");

        System.out.println("Digite o número desejado: ");
        number = scanner.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(number + " x " + i + " = " + (number*i));
        }

        System.out.println("Tabuada Finalizada");
    }
}

