/*
 * titulo: un programa para una biblioteca que debe gestionar los libros, los préstamos, estudiantes y bibliotecarios
 * autor: juan pablo suarez, juan pablo londoño
 * fecha: 27/09/2024
 * licencia: GNU GPL V3
 */
package co.edu.uniquindio.poo;

public class Persona {
    private String nombre, cedula, correo;
    private int telefono;
/* metodo constructor de la clase persona */
    public Persona(String nombre, String cedula, String correo, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }
/* metodos get y sets*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono + "]";
    }
}

