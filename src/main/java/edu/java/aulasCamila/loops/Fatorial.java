package edu.java.aulasCamila.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("==========================" +
                "\nFATORIAL" +
                "\n==========================");

        System.out.println("Digite o número desejado: ");
        number = scanner.nextInt();

        int multiplicacao = 1;

        for(int i = number ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println("O fatorial de " + number + " é: "+ multiplicacao);

    }
}
