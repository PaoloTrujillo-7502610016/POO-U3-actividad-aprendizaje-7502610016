package taller_19.ejercicio_1;

public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public void autenticarUsuario(String usuario, String password) {
        System.out.println("El usuario " + usuario+" se ha autenticado localmente");
    }

}
