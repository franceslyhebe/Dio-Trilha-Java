package edu.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int count = 0;
        do{
            System.out.println("Digite um número entre 0 e 100: ");
            int number = scanner.nextInt();
            if(number > 0 && number < 100){
                list.add(number);
            }
            count++;
        }while(count < 20);

        System.out.println(list);
    }

}
