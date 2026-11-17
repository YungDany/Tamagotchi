package Modelo;

public class Perro extends Tamagotchi implements TamagotchiActions {
    private int nivelImperactividad;
    private int nivelAgresividad;

        public Perro(String nombre, int hambre, int energia, int felicidad, int salud, boolean durmiendo, int nivelImperactividad, int nivelAgresividad) {
            super(nombre, hambre, energia, felicidad, salud, durmiendo);
            this.nivelImperactividad = limitarRango(nivelImperactividad);
            this.nivelAgresividad = limitarRango(nivelAgresividad);
        }

        public Perro(String nombre) {
            super(nombre);
            this.nivelImperactividad = 70;
            this.nivelAgresividad = 20;
        }

        @Override
        public void alimentar(TipoAlimento alimento) {

            setHambre(hambre - alimento.getReduccionHambre());

            setEnergia(energia + alimento.getEnergiaBase());
            // El perro gana salud y felicidad
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
            return nombre + "  (Nivel: " + nivelImperactividad + ").";
        }
    @Override
    public String mostrarComportamientoUnico2() {
        return nombre + "Esta persiguiendo su cola (Nivel: " + nivelImperactividad + ").";

    }

        @Override
        public String obtenDraw() {
            return " 🐶 [o.0] ";
        }

        @Override
        public String obtenerDetallesEspecificos() {
            return "Raza: Perro | Imperactividad: " + nivelImperactividad + " | Agresividad: " + nivelAgresividad;
        }


        public int getNivelImperactividad() {
            return nivelImperactividad;
        }

        public void setNivelImperactividad(int nivelImperactividad) {
            this.nivelImperactividad = limitarRango(nivelImperactividad);
        }

        public int getNivelAgresividad() {
            return nivelAgresividad;
        }

        public void setNivelAgresividad(int nivelAgresividad) {
            this.nivelAgresividad = limitarRango(nivelAgresividad);
        }
    }
//