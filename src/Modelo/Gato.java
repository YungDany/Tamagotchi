package Modelo;

public class Gato extends Tamagotchi implements TamagotchiActions {
 private int nivelIrritabilidad;
 private int nivelPereza;



    public Gato(String nombre, int hambre, int energia, int felicidad, int salud, boolean durmiendo, int nivelIrritabilidad, int nivelPereza) {
        super(nombre,hambre,energia,felicidad,salud,durmiendo);
        this.nivelPereza = nivelPereza;
        this.nivelIrritabilidad = nivelIrritabilidad;
    }

    public Gato(String nombre) {
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


