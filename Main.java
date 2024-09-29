/*
 * titulo: un programa para una biblioteca que debe gestionar los libros, los préstamos, estudiantes y bibliotecarios
 * autor: juan pablo suarez, juan pablo londoño
 * fecha: 27/09/2024
 * licencia: GNU GPL V3
 */
package co.edu.uniquindio.poo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        /* crea algunos libros para el ejemplo solo dos libros */
        Libro libro1 = new Libro("001", "978-3-16-148410-0", "gabriel garcia", "Editorial 1", "Título 1", LocalDate.of(2020, 1, 1), Estado.DISPONIBLE, 5, 1.5);
        Libro libro2 = new Libro("002", "978-3-16-148410-1", "mario mendoza", "Editorial 2", "Título 2", LocalDate.of(2021, 1, 1), Estado.DISPONIBLE, 3, 2.0);

      /* agrega los libros a la biblioteca */
        biblioteca.getLibros().add(libro1);
        biblioteca.getLibros().add(libro2);

        /* crea un estudiante */
        Estudiante estudiante = new Estudiante("Juan", "123456", "juan@gmail.com", 123456789, 20);

        /* crea un bibliotecario */
        Bibliotecario bibliotecario = new Bibliotecario("Maria", "654321", "maria@gmail.com", 987654321, 2000.0, 5);

        /* hace el intento de prestar un libro */
        boolean prestamoExitoso = biblioteca.prestarLibro(estudiante, bibliotecario, libro1, 1, "P001");

        if (prestamoExitoso) {
            System.out.println("Préstamo realizado exitosamente.");
        } else {
            System.out.println("No se pudo realizar el préstamo.");
        }

        System.out.println(biblioteca);
    }
}
