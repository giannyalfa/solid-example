package org.example;

/*
* Infracción Single Responsibility Principle (Responsabilidad Única):
* La clase Empleado tiene múltiples responsabilidades: calcular el pago, guardar en la base de datos y generar reportes.
* */

public class Empleado {

    private String nombre;
    private String tipo;
    private double salario;
    public Empleado(String nombre, String tipo, double salario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.salario = salario;
    }

    public double calcularPago() {
        if (tipo.equals("Gerente")) {
            return salario + 1000; // Bono para gerentes
        } else if (tipo.equals("Desarrollador")) {
            return salario;
        } else if (tipo.equals("Practicante")) {
            return salario * 0.5; // Practicantes reciben medio salario
        }
        return salario;
    }

    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando empleado " + nombre + " en la base de datos...");
    }

    public void generarReporte() {
        System.out.println("Generando reporte para el empleado " + nombre + "...");
    }
}
