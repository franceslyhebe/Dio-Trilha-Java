package edu.java.arrays;

import java.util.Arrays;
import java.util.Collections;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};

        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
