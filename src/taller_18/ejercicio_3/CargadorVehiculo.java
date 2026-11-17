package taller_18.ejercicio_3;

public class CargadorVehiculo implements Cargador{

    @Override
    public void cargar(int cantidadMercancia) {
        System.out.println("Se cargan "+cantidadMercancia+" unidades de mercancia al vehiculo");
    }

}
