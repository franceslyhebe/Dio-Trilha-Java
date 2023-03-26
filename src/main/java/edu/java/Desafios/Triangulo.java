package edu.java.Desafios;

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.
        boolean triangulo = (A + B > C) && (A + C > B) && (B + C > A);

        double valor = 0d;
        String mensagem = "";

        if (triangulo) {
            mensagem = "Perimetro";
            valor = A + B + C;
        } else {
            mensagem = "Area";
            valor = ((A + B) * C) / 2;
        }

        System.out.printf("%s = %.1f", mensagem, valor);

        leitor.close();

    }

}
