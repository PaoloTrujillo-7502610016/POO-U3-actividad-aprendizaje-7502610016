package taller_18.ejercicio_1;

public class Main {


    public static void main(String[] args) {
        System.out.println("\nEjercicio 1:\n");

        LimpiadorMantenimiento limpiador = new LimpiadorMantenimiento();
        limpiador.limpiar();

        ReparadorMantenimiento reparador = new ReparadorMantenimiento();
        reparador.reparar();

    }
}
