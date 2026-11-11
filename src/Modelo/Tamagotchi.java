package Modelo;

public class Tamagotchi {

    protected String nombre;
    protected int hambre;
    protected int energia;
    protected int felicidad;
    protected int salud;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHambre() {
        return hambre;
    }

    public int getEnergia() {
        return energia;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public int getSalud() {
        return salud;
    }

    public Tamagotchi(String nombre, int hambre, int energia,int felicidad, int salud){
        this.nombre=nombre;
        this.hambre=hambre;
        this.energia=energia;
        this.felicidad=felicidad;
        this.salud=salud;
    }




}
