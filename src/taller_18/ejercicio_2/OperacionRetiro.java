package taller_18.ejercicio_2;

public class OperacionRetiro implements Retiro{
    @Override
    public void retirarDinero(double valor) {
        System.out.println("Se ha retirado el valor de $:"+valor);
    }
}
