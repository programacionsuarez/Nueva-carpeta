/*
 * titulo: un programa para una biblioteca que debe gestionar los libros, los préstamos, estudiantes y bibliotecarios
 * autor: juan pablo suarez, juan pablo londoño
 * fecha: 27/09/2024
 * licencia: GNU GPL V3
 */
package co.edu.uniquindio.poo;

public class DetallePrestamo {
    private int cantidad;
    private double subTotal;
    private Libro libro;
/* metodo constructor de la clase detallePrestamo */

    public DetallePrestamo(int cantidad, Libro libro) {
        this.cantidad = cantidad;
        this.libro = libro;
        this.subTotal = 0;
    }

    public double calcularSubtotal() {
        subTotal = cantidad * libro.getCostoDia(); 
        return subTotal;
    }

    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", subTotal=" + subTotal + ", libro=" + libro + "]";
    }
}
