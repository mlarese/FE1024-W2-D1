package it.epicode;
import it.epicode.classi.Libro;
import it.epicode.exceptions.LibroGiaPrestatoException;


public class Main {

    public static void main(String[] args) {
        Libro libro = new Libro("Il signore degli anelli", "J.R.R. Tolkien", 1954, "Fantasy", "Bompiani");

        // primo prestito non viene lanciata nessuna eccezione
        try {
            System.out.println("-------------------- primo prestito");
            libro.presta();
            System.out.println("Libro prestato");
        } catch (LibroGiaPrestatoException e) {
            System.out.println(e.getMessage());
        }

        // proviamo a riprestare lo stesso libro
        // per verificare che venga lanciata l'eccezione
        // nel secondo tentativo il libro è già stato prestato
        // per cui siamo bloccati dal programma tramiteun eccezione
        try {
            System.out.println("-------------------- secondo prestito");

            libro.presta();
            System.out.println("Libro prestato");
        } catch (LibroGiaPrestatoException e) {
            System.out.println(e.getMessage());
        }


    }
}
