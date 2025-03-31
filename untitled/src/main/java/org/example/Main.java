package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Empleado("Juan", "Gerente", 5000);
        Empleado desarrollador = new Empleado("Ana", "Desarrollador", 3000);
        Empleado practicante = new Empleado("Luis", "Practicante", 1000);
        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados();
        sistema.procesarEmpleado(gerente);
        sistema.procesarEmpleado(desarrollador);
        sistema.procesarEmpleado(practicante);
    }
}