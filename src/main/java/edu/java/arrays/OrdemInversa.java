package edu.java.arrays;

import java.util.Arrays;
import java.util.Collections;


/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {
    static void reverse(int arrays[]){
        Collections.reverse(Arrays.asList(arrays));
        System.out.println(Arrays.asList(arrays));
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        reverse(array);
    }
}
