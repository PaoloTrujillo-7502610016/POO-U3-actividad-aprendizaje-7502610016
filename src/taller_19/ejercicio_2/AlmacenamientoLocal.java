package taller_19.ejercicio_2;

public class AlmacenamientoLocal implements Almacenamiento {

    @Override
    public void guardarArchivo(String nombreArchivo, int tamanioMb) {
        System.out.println("Archivo "+nombreArchivo+", tamaño: "+tamanioMb+"Mb, guardado localmente");
    }

    @Override
    public void eliminarArchivo(String nombreArchivo, int tamanioMb) {
        System.out.println("Archivo "+nombreArchivo+", tamaño: "+tamanioMb+"Mb, eliminado localmente");
    }

    @Override
    public void recuperarArchivo(String nombreArchivo, int tamanioMb) {
        System.out.println("Archivo "+nombreArchivo+", tamaño: "+tamanioMb+"Mb, recuperado de la papelera local");
    }

}
