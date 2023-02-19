package edu.java.outrasAulas;

public class SmartTV {
    private boolean ligada;
    private int canal;
    private int volume;

    public String isLigada(boolean Ligada){
        ligada = Ligada;

        if(ligada = true){
            return "A TV está ligada";
        }
        else{
            return "A TV está desligada";
        }

    }

    public int isCanal(){
        canal++;
        return canal;
    }


    public int aumentarVolume(){
        volume++;
        return volume;
    }

}
