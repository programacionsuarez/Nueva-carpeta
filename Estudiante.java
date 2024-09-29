/*
 * titulo: un programa para una biblioteca que debe gestionar los libros, los préstamos, estudiantes y bibliotecarios
 * autor: juan pablo suarez, juan pablo londoño
 * fecha: 27/09/2024
 * licencia: GNU GPL V3
 */
package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Estudiante extends Persona {
    private int edad;
    private Collection<Prestamo> prestamos;
/* metodo constructor de la clase estudiante */
    public Estudiante(String nombre, String cedula, String correo, int telefono, int edad) {
        super(nombre, cedula, correo, telefono);
        this.edad = edad;
        prestamos = new LinkedList<>();
    }
/* metodos get y sets*/
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante [edad=" + edad + ", prestamos=" + prestamos + "]";
    }
}

