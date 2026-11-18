package taller_19.ejercicio_2;

public class AlmacenamientoNube implements Almacenamiento {

    @Override
    public void guardarArchivo(String nombreArchivo, int tamanioMb) {
        System.out.println("Archivo "+nombreArchivo+", tamaño: "+tamanioMb+"Mb, guardado en la nube");
    }

    @Override
    public void eliminarArchivo(String nombreArchivo, int tamanioMb) {
        System.out.println("Archivo "+nombreArchivo+", tamaño: "+tamanioMb+"Mb, eliminado de la nube");
    }

    @Override
    public void recuperarArchivo(String nombreArchivo, int tamanioMb) {
        System.out.println("Archivo " + nombreArchivo + ", tamaño: " + tamanioMb + "Mb, recuperado de la papelera de la nube");
    }

}
