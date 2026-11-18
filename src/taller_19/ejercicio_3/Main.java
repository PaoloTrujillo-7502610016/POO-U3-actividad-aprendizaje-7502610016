package taller_19.ejercicio_3;

public class Main {


    public static void main(String[] args) {
        System.out.println("\nEjercicio 3:\n");

        GeneradorReporte reportePDF = new ReportePDF();
        GestorReporte gestorReporte = new GestorReporte(reportePDF);
        gestorReporte.generar("Reporte de ventas","Contabilidad");

        GeneradorReporte reporteExcel = new ReporteExcel();
        gestorReporte = new GestorReporte(reporteExcel);
        gestorReporte.generar("Contrataciones","Recursos Humanos");

    }
}
