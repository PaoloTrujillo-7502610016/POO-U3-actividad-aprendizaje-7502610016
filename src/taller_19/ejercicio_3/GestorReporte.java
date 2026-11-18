package taller_19.ejercicio_3;

public class GestorReporte {
    private GeneradorReporte generador;

    public GestorReporte(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void generar(String nombreReporte, String departamento) {
        generador.generarReporte(nombreReporte, departamento);
    }

}
