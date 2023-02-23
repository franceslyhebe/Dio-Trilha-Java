/*
Faça um programa que receba a temperatura media dos 6 primeiros meses do ano
e armazene-as em uma lista. Após isto, calcule a média semestral das temperaturas
e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram.
* */

package edu.java.aulasCamila.collections.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioProposto {
    public static void main(String[] args) {
        List<Double> temperatura = new ArrayList<>();
        temperatura.add(23.5);
        temperatura.add(25.8);
        temperatura.add(29.2);
        temperatura.add(31.6);
        temperatura.add(38.5);
        temperatura.add(32.6);

        System.out.println(temperatura.toString());

        Iterator<Double> iterator = temperatura.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        Double media = soma / 6;

        System.out.println("A média das temperaturas é: " + media);

        Iterator<Double> iteratorMedia = temperatura.iterator();
        Double somaMedia = 0d;
        Double count = 0d;
        while(iteratorMedia.hasNext()){
            Double next = iteratorMedia.next();
            if(next >= media) {
                somaMedia += next;
                count++;
            }
        }
        Double somaMed = somaMedia / count;

        System.out.println("A média das temperaturas acima de " + media + " é: " + somaMed);


        System.out.println("\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator2 = temperatura.iterator();

        int count2 = 0;
        while (iterator2.hasNext()) {
            Double temp = iterator2.next();
            if (temp > media) {
                switch (count2) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count2++;
        }

    }
}
