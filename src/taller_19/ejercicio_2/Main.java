package taller_19.ejercicio_2;

public class Main {


    public static void main(String[] args) {
        System.out.println("\nEjercicio 2:\n");

        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorArchivos = new GestorArchivos(almacenamientoLocal);
        gestorArchivos.guardar("Protocolo Individual",12);
        gestorArchivos.eliminar("Protocolo Individual",12);
        gestorArchivos.recuperar("Protocolo Individual",12);

        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        gestorArchivos = new GestorArchivos(almacenamientoNube);
        gestorArchivos.recuperar("Protocolo Colaborativo",8);
        gestorArchivos.guardar("Protocolo Colaborativo",8);
        gestorArchivos.recuperar("Protocolo Colaborativo",8);

    }
}
