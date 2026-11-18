package taller_19.ejercicio_2;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento){
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombreArchivo, int tamanioMb){
        almacenamiento.guardarArchivo(nombreArchivo, tamanioMb);
    }

    public void eliminar(String nombreArchivo, int tamanioMb){
        almacenamiento.eliminarArchivo(nombreArchivo, tamanioMb);
    }

    public void recuperar(String nombreArchivo, int tamanioMb){
        almacenamiento.recuperarArchivo(nombreArchivo, tamanioMb);
    }

}
