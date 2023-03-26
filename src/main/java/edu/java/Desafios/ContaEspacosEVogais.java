package edu.java.Desafios;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ContaEspacosEVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regexVogais = "[aeiou]";
        String regexEspaco = "\\s";

        final Pattern patternVogais = Pattern.compile(regexVogais, Pattern.CASE_INSENSITIVE);
        final Pattern patternEspaco = Pattern.compile(regexEspaco, Pattern.CASE_INSENSITIVE);

        int espacosEmBranco = 0, quantVogais = 0;

        for (char item : str.toCharArray()) {
            if (patternVogais.matcher(String.valueOf(item)).matches()) quantVogais++;
            else if (patternEspaco.matcher(String.valueOf(item)).matches()) espacosEmBranco++;
        }

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);

        sc.close();
    }
}
