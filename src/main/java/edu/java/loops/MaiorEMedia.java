package edu.java.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int major = 0;
        int sum = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            number = scanner.nextInt();

            sum = sum + number;

            if (number > major) major = number;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + major);
        System.out.println("Média: " + (sum/5));
    }
}
