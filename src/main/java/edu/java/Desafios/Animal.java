package edu.java.Desafios;

import java.io.IOException;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1,AN2,AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();


        String[] tipoAnimal = new String[3];
        tipoAnimal[0] = AN1;
        tipoAnimal[1] = AN2;
        tipoAnimal[2] = AN3;

        String resultado = "";
        //TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
        //Dica: Você pode utilizar o método equals para realizar comparações.
        resultado = (tipoAnimal[0].equals("vertebrado"))
                ? (tipoAnimal[1].equals("ave"))
                ? (tipoAnimal[2].equals("carnivoro"))
                ? "aguia"
                : "pomba"
                : (tipoAnimal[2].equals("onivoro"))
                ? "homem"
                : "vaca"
                : (tipoAnimal[1].equals("inseto"))
                ? (tipoAnimal[2].equals("hematofago"))
                ? "pulga"
                : "lagarta"
                : (tipoAnimal[2].equals("hematofago"))
                ? "sanguessuga"
                : "minhoca";

        System.out.println(resultado);

        sc.close();
    }
}
