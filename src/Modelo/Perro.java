package Modelo;

public class Perro extends Tamagotchi implements  TamagotchiActions {
private int nivelImperactividad;
private int nivelAgresividad;

    public Perro(String nombre, int hambre, int energia, int felicidad, int salud) {
        super(nombre, hambre, energia, felicidad, salud);
    }

    @Override
    public void comer(int alimento) {

    }

    @Override
    public void jugar() {


        }

}
