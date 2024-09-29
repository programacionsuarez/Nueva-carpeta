
/*
 * titulo: un programa para una biblioteca que debe gestionar los libros, los préstamos, estudiantes y bibliotecarios
 * autor: juan pablo suarez, juan pablo londoño
 * fecha: 27/09/2024
 * licencia: GNU GPL V3
 */

 package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private Collection<Estudiante> estudiantes;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private Collection<Libro> libros;
    private double ganancia;
    private int cantidadLibros;

    /* metodo constructor de la clase biblioteca */

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.ganancia = 0.0;
        this.cantidadLibros = 100;
        estudiantes = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
    }
/* metodos get y sets de la clase biblioteca */ 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Collection<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    /* metodo para prestar un libro*/
    public boolean prestarLibro(Estudiante estudiante, Bibliotecario bibliotecario, Libro libro, int cantidad, String codigoPrestamo) {
        // Verifica si hay unidades disponibles y si la cantidad solicitada es válida
        if (libro.getUnidadesDisponibles() > 0 && cantidad <= libro.getUnidadesDisponibles()) {
            LocalDate fechaPrestamo = LocalDate.of(2024, 9, 1);
            LocalDate fechaEntrega = fechaPrestamo.plusDays(7); 
            
            /* Crear el préstamo */
            Prestamo prestamo = new Prestamo(fechaPrestamo, fechaEntrega, libro.getCostoDia(), codigoPrestamo, estudiante, bibliotecario);
            prestamos.add(prestamo);
            
            /* Disminuir la cantidad de unidades disponibles del libro */
            libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - cantidad);
            
            /* Aumentar las ganancias de la biblioteca y hace la multiplicacion por la cantidad */
            ganancia += libro.getCostoDia() * cantidad; 
            return true; 
        }
        return false;
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", estudiantes=" + estudiantes + ", bibliotecarios=" + bibliotecarios
                + ", prestamos=" + prestamos + ", libros=" + libros + ", ganancia=" + ganancia + ", cantidadLibros="
                + cantidadLibros + "]";
    }
}

