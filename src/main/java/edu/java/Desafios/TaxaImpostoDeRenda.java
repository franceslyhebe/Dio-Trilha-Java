package edu.java.Desafios;

import java.io.IOException;
import java.util.Scanner;

public class TaxaImpostoDeRenda {
    public void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double total = 0d;
        double taxa = 0d;

        //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
        if(renda > 4500.00){
            total = renda - 4500.00;
            taxa += (total * 0.28) + 350;
            System.out.println(String.format("R$ %.2f", taxa));
        }else if(renda > 3000.00){
            total = renda - 3000.00;
            taxa += (total * 0.18) + 80;
            System.out.println(String.format("R$ %.2f", taxa));
        }else if(renda > 2000.00){
            total = renda - 2000.00;
            taxa += (total * 0.08);
            System.out.println(String.format("R$ %.2f", taxa));
        }else{
            System.out.println("Isento");
        }
    }

}
