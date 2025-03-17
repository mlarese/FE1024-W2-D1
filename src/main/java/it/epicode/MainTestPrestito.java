package it.epicode;


// questo main consente di avere un elenco di libri
// e tramite interazione con scanner di prestare i libri anche più volte
// ovviamente nel caso di prestito già effettuato verrà lanciata un'eccezione

import it.epicode.classi.Libro;
import it.epicode.exceptions.LibroGiaPrestatoException;

import java.util.Scanner;

public class MainTestPrestito {
    public static void main(String[] args) {
        Libro[] biblioteca = {
                new Libro("Il signore degli anelli", "J.R.R. Tolkien", 1954, "Fantasy", "Bompiani"),
                new Libro("1984", "Orwell", 1949, "Distopico", "Secker & Warburg"),
                new Libro("Il Nome della Rosa", "Umberto Eco", 1980, "Storico", "Bompiani")

        };


        boolean presta = true;
        System.out.println("Elenco dei libri disponibili:");
        for (int i = 0; i < biblioteca.length; i++) {
            System.out.println(i + " - " + biblioteca[i].getTitolo());
        }


        Scanner scanner = new Scanner(System.in);

        while (presta) {
            Libro libroDaPrestare = null;
            try {
                System.out.println("--------------------------------------------");
                System.out.println("Inserisci il numero del libro da prestare   -1 per uscire");
                System.out.println("--------------------------------------------");

                int scelta = scanner.nextInt();
                if (scelta == -1) {
                    presta = false;
                    continue;
                }
                libroDaPrestare = biblioteca[scelta];
            } catch (Exception e) {
                System.out.println("Errore nell'inserimento del numero del libro");
                scanner.nextLine();
                continue;
            }

            try {
                libroDaPrestare.presta();
                System.out.println("==== Libro prestato ====");
            } catch (LibroGiaPrestatoException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
