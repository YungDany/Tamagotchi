package Modelo;

public class Capibara extends Tamagotchi{

    public Capibara(String nombre, int hambre, int energia, int felicidad, int salud, boolean durmiendo) {
        super(nombre, hambre, energia, felicidad, salud, durmiendo);
    }

    public Capibara(String nombre) {
        super(nombre);
    }

    @Override
    public String obtenDraw() {
        return "";
    }

    @Override
    public String obtenerDetallesEspecificos() {
        return "";
    }

    @Override
    public void alimentar(TipoAlimento alimento) {

    }

    @Override
    public void jugar(TipoJuego juego) {

    }

    @Override
    public String mostrarComportamientoUnico() {
        return "";
    }

    @Override
    public String mostrarComportamientoUnico2() {
        return "";
    }
}




