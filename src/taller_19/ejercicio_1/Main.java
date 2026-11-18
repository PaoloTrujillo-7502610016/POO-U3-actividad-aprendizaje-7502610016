package taller_19.ejercicio_1;

public class Main {


    public static void main(String[] args) {
        System.out.println("\nEjercicio 1:\n");
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorAutenticacion = new GestorAutenticacion(autenticacionLocal);
        gestorAutenticacion.autenticar("administrador", "123456");

        ServicioAutenticacion autenticacion0Auth = new Autenticacion0Auth();
        gestorAutenticacion = new GestorAutenticacion(autenticacion0Auth);
        gestorAutenticacion.autenticar("cliente", "234568");

    }
}
