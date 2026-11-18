package taller_19.ejercicio_1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {//Constructor
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void autenticar(String usuario, String password) {
        servicioAutenticacion.autenticarUsuario(usuario, password);
    }

    /*La clase GestorAutenticacion depende de la abstraccion de ServicioAutenticacion*/

}
