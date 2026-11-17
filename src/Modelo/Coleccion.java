package Modelo;

import java.util.ArrayList;
public class Coleccion {

    private ArrayList<Tamagotchi> misJuguetes;

    public Coleccion(){
        misJuguetes=new ArrayList<>();

    }

    public void agregar(Tamagotchi t){
        misJuguetes.add(t);
    }

    public String listaJuguetes(){
        StringBuffer cadena=new StringBuffer();


    }


}
