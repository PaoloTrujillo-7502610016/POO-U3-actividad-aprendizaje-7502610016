package taller_18.ejercicio_3;

public class ConductorVehiculo implements Conductor {

    @Override
    public void conducir(String nombre){
        System.out.println("El conductor "+nombre+" ha empezado a conducir");
    };

}
