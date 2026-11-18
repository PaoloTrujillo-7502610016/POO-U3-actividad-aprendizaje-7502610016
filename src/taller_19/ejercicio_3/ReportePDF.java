package taller_19.ejercicio_3;

public class ReportePDF implements GeneradorReporte{

    @Override
    public void generarReporte(String nombreReporte, String departamento) {
        System.out.println("El reporte "+nombreReporte+" del departamento de "+departamento+" se ha exportado a PDF");
    }

}
