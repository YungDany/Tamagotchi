package Vista;
import Modelo.*;
import java.util.List;
import java.util.Scanner;


public class VistaConsola {
    private final Scanner scanner;

    public VistaConsola(){
        this.scanner=new Scanner(System.in);
    }

    public void mostrarBannerInicio(){
        System.out.println("TAMAGOTCHIS");

    }

    public int mostrarMenuPrincipal(){
        System.out.println("\n Menú Principal \n");
        System.out.println("1. Adoptar un nuevo tamagotchi");
        System.out.println("2. Interactuar con el tamagotchi");
        System.out.println("3. Ver el estado de todos los tamagotchis");
        System.out.println("4. Avanzar el tiempo (Simulador de horas");
        System.out.println("5. Salir");
        return leerEntero("Seleccione una opción: ",1,5);
    }

    public int seleccionarUnaEspecie(){
        System.out.println("Escoja una especie: ");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Cuyo");
        System.out.println("4. Muñeca");
        System.out.println("5. Capibara");
        return leerEntero("Especie: ",1,5);
    }

    public String pedirNombreMascota(){
        System.out.println("Ingrese el nombre de su nuevo tamagotchi: ");
        String nombre = scanner.nextLine().trim();
        return nombre.isEmpty()?"Sin nombre" : nombre;
    }

    public int seleccionarMascota(List<Tamagotchi> mascotas){
        System.out.println("\n--- TUS TAMAGOTCHIS ---");
        for (int i = 0; i < mascotas.size(); i++) {
            Tamagotchi t = mascotas.get(i);
            System.out.printf("%d. %s (%s) - Estado: %s%n",
                    (i + 1), t.getNombre(), t.getClass().getSimpleName(), t.obtenerEstadoAnimo());
        }
        return leerEntero("Elige el número de mascota: ", 1, mascotas.size()) - 1;

    }

    public int mostrarMenuInteraccion(Tamagotchi t) {
        mostrarTarjetaEstado(t);
        System.out.println("\n Acciones para" + t.getNombre().toUpperCase() + " ---");
        System.out.println("1. Alimentar");
        System.out.println("2. Jugar");
        System.out.println("3. Dormir");
        System.out.println("4. Comportamiento especial 1");
        System.out.println("5. Comportamiento especial 2");
        System.out.println("6. Volver al menú principal");
        return leerEntero("¿Qué deseas hacer?: ", 1, 6);
    }

    public TipoAlimento seleccionarAlimento() {
        System.out.println("\n Menú de Alimentos \n");
        TipoAlimento[] alimentos = TipoAlimento.values();
        for (int i = 0; i < alimentos.length; i++) {
            System.out.printf("%d. %s%n", (i + 1), alimentos[i].getNombre());
        }
        int opcion = leerEntero("Elige alimento: ", 1, alimentos.length);
        return alimentos[opcion - 1];
    }

    public TipoJuego seleccionarJuego() {
        System.out.println("\n--- ACTIVIDADES DE JUEGO ---");
        TipoJuego[] juegos = TipoJuego.values();
        for (int i = 0; i < juegos.length; i++) {
            System.out.printf("%d. %s%n", (i + 1), juegos[i].getNombre());
        }
        int opcion = leerEntero("Elige juego: ", 1, juegos.length);
        return juegos[opcion - 1];
    }

    private String generarBarra(int valor) {
        int bloquesLlenos = valor / 10;
        return "[" + "█".repeat(bloquesLlenos) + "░".repeat(10 - bloquesLlenos) + "]";
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println("\n>> " + mensaje);
    }

    private int leerEntero(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            try {
                int valor = Integer.parseInt(scanner.nextLine().trim());
                if (valor >= min && valor <= max) {
                    return valor;
                }
                System.out.println("Por favor, ingresa un número entre " + min + " y " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingresa un número.");
            }
        }
    }

    public void mostrarTarjetaEstado(Tamagotchi t) {
        System.out.println("\n");
        System.out.printf(" Mascota: %-15s | ESPECIE: %s%n", t.getNombre(), t.getClass().getSimpleName());
        System.out.println(t.obtenDraw());
        System.out.println("--------------------------------------------------");
        System.out.println(" Ánimo:     " + t.obtenerEstadoAnimo().getDescripcion());
        System.out.println(" Durmiendo: " + (t.estaDurmiendo() ? "Sí (zZz)" : "No (Despierto)"));
        System.out.println(" Detalles:  " + t.obtenerDetallesEspecificos());
        System.out.println("--------------------------------------------------");
        System.out.println(" Hambre:    " + generarBarra(t.getHambre()) + " " + t.getHambre() + "/100");
        System.out.println(" Energía:   " + generarBarra(t.getEnergia()) + " " + t.getEnergia() + "/100");
        System.out.println(" Felicidad: " + generarBarra(t.getFelicidad()) + " " + t.getFelicidad() + "/100");
        System.out.println(" Salud:     " + generarBarra(t.getSalud()) + " " + t.getSalud() + "/100");
    }
//

}