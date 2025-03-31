package org.example;

public class SistemaGestionEmpleados {
    public void procesarEmpleado(Empleado empleado) {
        double pago = empleado.calcularPago();
        System.out.println("Pago calculado: " + pago);
        empleado.guardarEnBaseDeDatos();
        empleado.generarReporte();
    }
}
