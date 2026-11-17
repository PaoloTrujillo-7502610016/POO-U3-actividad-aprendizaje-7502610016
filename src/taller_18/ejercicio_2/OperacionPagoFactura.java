package taller_18.ejercicio_2;

public class OperacionPagoFactura implements PagoFactura{

    @Override
    public void pagarFactura(String empresa, double valor) {
        System.out.println("Se ha pagado la factura de "+empresa+ " por valor de $"+valor);
    }

}
