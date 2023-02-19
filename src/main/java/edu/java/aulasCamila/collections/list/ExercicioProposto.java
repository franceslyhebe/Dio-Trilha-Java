package edu.java.aulasCamila.collections.list;

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
        System.out.println("Temperaturas acima da média: " );


    }
}
