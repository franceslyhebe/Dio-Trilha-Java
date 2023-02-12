package edu.java.SmartTV;

public class Usuario {

    public static void main(String[] args) {
        SmartTV minhaTv = new SmartTV();
        String estado = minhaTv.isLigada(true);

        int canal = minhaTv.isCanal();
        canal+=5;

        int volume = minhaTv.aumentarVolume();
        volume++;
        volume++;
        System.out.println(estado + "\nO volume está em : " + volume + "\nO canal é o : " + canal);
    }
}
