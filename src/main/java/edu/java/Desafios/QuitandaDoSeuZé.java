package edu.java.Desafios;

import java.util.Scanner;

public class QuitandaDoSeuZé {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
        double valorKgMorango = (morangos > 5) ? 2.2 : 2.5; //calcular o valor do morango de acordo com peso;
        double valorMorangos = morangos * valorKgMorango;  //calcular o valor total de morangos

        double valorKgMaca = (macas > 5) ? 1.5 : 1.8;  //calcular o valor do morango de acordo com peso;
        double valorMacas = macas * valorKgMaca;    //calcular o valor total de morangos

        int pesoCompra = morangos + macas; //Calcular o peso total da compra

        double valorTotalCompra = valorMorangos + valorMacas; //Calcular o valor total da compra

        if (pesoCompra > 8 || valorTotalCompra > 25.0) valorTotalCompra -= (0.1 * valorTotalCompra); //Condicional que analisa desconto

        System.out.println(valorTotalCompra);

        input.close();
    }
    }

