package taller_18.ejercicio_2;

public class OperacionTransferencia implements Transferencia{

    @Override
    public void transferirDinero(int cuentaDestino, double valor) {
        System.out.println("Se ha transferido el valor de $"+valor+" a la cuenta #: "+cuentaDestino);
    }

}
