/*
 * titulo: un programa para una biblioteca que debe gestionar los libros, los préstamos, estudiantes y bibliotecarios
 * autor: juan pablo suarez, juan pablo londoño
 * fecha: 27/09/2024
 * licencia: GNU GPL V3
 */
package co.edu.uniquindio.poo;
import java.time.LocalDate;

public class Libro {
    private String codigo, isbn, autor, editorial, titulo;
    private LocalDate fechaPublicacion;
    private Estado estado;
    private int unidadesDisponibles;
    private double costoDia;
/* metodo constructor de la clase libro */
    public Libro(String codigo, String isbn, String autor, String editorial, String titulo, 
                 LocalDate fechaPublicacion, Estado estado, int unidadesDisponibles, double costoDia) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.estado = estado;
        this.unidadesDisponibles = unidadesDisponibles;
        this.costoDia = costoDia;
    }
/* metodos get y sets */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Estado isEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public double getCostoDia() {
        return costoDia;
    }

    public void setCostoDia(double costoDia) {
        this.costoDia = costoDia;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + 
               ", editorial=" + editorial + ", titulo=" + titulo + 
               ", fechaPublicacion=" + fechaPublicacion + ", estado=" + estado + 
               ", unidadesDisponibles=" + unidadesDisponibles + 
               ", costoDia=" + costoDia + "]";
    }
}

