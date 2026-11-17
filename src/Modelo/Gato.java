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
        this.nivelPereza = 50;
        this.nivelIrritabilidad =35;
    }

    @Override
    public String obtenDraw() {
        return "";
    }

    @Override
    public String obtenerDetallesEspecificos() {
        return "Raza: Gato | Irritabilidad: " + nivelIrritabilidad + " | Pereza: " + nivelPereza;
    }

    @Override
    public void alimentar(TipoAlimento alimento) {
        setHambre(hambre - alimento.getReduccionHambre());
        setEnergia(energia + alimento.getEnergiaBase());
        //el gato recibe comida y felicidad
        setSalud(salud + 5);
        setFelicidad(felicidad + 10);
        System.out.println(nombre + " ha comido " + alimento.getNombre());
    }

    @Override
    public void jugar(TipoJuego juego) {
        // Aumenta felicidad y gasta energía / sube hambre según el tipo de juego
        setFelicidad(felicidad + juego.getAumentoFelicidad());

        setEnergia(energia - juego.getGastoEnergetico());

        setHambre(hambre + 15);
        System.out.println(nombre + " jugó a: " + juego.getNombre());
    }

    @Override
    public String mostrarComportamientoUnico() {
        return nombre + "se lame la pata con mucha calma(Nivel: " + nivelPereza + ").";

    }

    @Override
    public String mostrarComportamientoUnico2() {
        return nombre + "Esta aullando con fuerza(Nivel: " + nivelIrritabilidad + ").";
    }

    @Override
    public void dormir(){
        super.dormir();
        setEnergia(energia+15);
        this.nivelPereza=Math.min(100,this.nivelPereza+10);
    }
}


