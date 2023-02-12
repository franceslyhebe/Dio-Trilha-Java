package edu.java.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Infome uma nota: ");
        nota = scanner.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota Inválida!\n Digite a nota:");
            nota = scanner.nextInt();
        }

        System.out.println("Finalizado");
    }
}
