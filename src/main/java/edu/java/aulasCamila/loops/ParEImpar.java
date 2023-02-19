package edu.java.aulasCamila.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, numbers, countOdd = 0, countEven = 0;

        System.out.println("Digite a quantidade de números que será analisados: ");
        number = scanner.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numbers = scanner.nextInt();

            if (numbers % 2 == 0 ) countEven++;
            else countOdd++;

            count++;
        } while(count < number);

        System.out.println("Quantidade Par: " + countOdd);
        System.out.println("Quantidade Ímpar: " + countEven);


    }
}
