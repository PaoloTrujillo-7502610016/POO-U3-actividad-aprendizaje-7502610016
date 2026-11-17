package taller_18.ejercicio_2;

public class Main {


    public static void main(String[] args) {
        System.out.println("\nEjercicio 2:\n");

        OperacionTransferencia transferencia = new OperacionTransferencia();
        transferencia.transferirDinero(123456,250000);

        OperacionRetiro retiro = new OperacionRetiro();
        retiro.retirarDinero(1200000);

        OperacionPagoFactura pagoFactura = new OperacionPagoFactura();
        pagoFactura.pagarFactura("Acueducto",65000);

    }
}
