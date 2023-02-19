package edu.java.aulasCamila.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        System.out.println("Imprima uma lista com 7 notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d),6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + (notas.contains(5d)? "Esta na lista": "Não esta na lista"));

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + soma /notas.size());

        notas.remove(0d);
        System.out.println("Remova a nota 0: " + notas);

        notas.remove(0);
        System.out.println("Remova a nota na posição 0: " + notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println("Remova as notas menores que 7 e exiba a lista: " + notas);

        /*
        Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
        */

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        List<Double> notas2 = new ArrayList<Double>();
        notas2.add(3.5);
        notas2.add(5.0);
        notas2.add(10d);
        notas2.add(2.5);
        notas2.add(7.6);

        System.out.println(notas2.toString());

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));
        notas2.remove(0);
        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.get(0));
    }
}
