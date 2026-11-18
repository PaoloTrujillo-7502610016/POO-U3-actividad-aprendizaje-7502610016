package taller_19.ejercicio_2;

public interface Almacenamiento {

    void guardarArchivo(String nombreArchivo, int tamanioMb);
    void eliminarArchivo(String nombreArchivo, int tamanioMb);
    void recuperarArchivo(String nombreArchivo, int tamanioMb);

}
