package edu.java.aulasCamila.arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Consoantes {
    public static void main(String[] args) {
        String[] consonants = new String[6];
        Scanner scanner = new Scanner(System.in);

        int countConsonants = 0;
        int countVoyals = 0;
        int count = 0;

        do{
            System.out.println("Digite uma letra: ");
            String letra = scanner.next();

               if(letra.equals("a")|letra.equals("e")|letra.equals("i")|letra.equals("o")|letra.equals("u")){
                    countVoyals++;
               }else{
                   countConsonants++;
               }
               count++;
        }while(count < 6);

        System.out.println("Quantidade de consoantes: " + countConsonants);
        System.out.println("Quantidade de vogais: " + countVoyals);
    }
}
