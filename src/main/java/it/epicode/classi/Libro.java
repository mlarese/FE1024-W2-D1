package it.epicode.classi;

import it.epicode.exceptions.LibroGiaPrestatoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Libro {
    private static final Logger logger = LoggerFactory.getLogger(Libro.class);
    private String titolo;
    private String autore;
    private int annoPubblicazione;
    private String genere;
    private String casaEditrice;

    // inizializza il campo prestato a false
    private boolean prestato=false;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice;
    }

    public boolean isPrestato() {
        return prestato;
    }

    public Libro(String titolo, String autore, int annoPubblicazione, String genere, String casaEditrice) {
        logger.debug("creazione di un nuovo libro");

        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.genere = genere;
        this.casaEditrice = casaEditrice;

        // altra possibile soluzione per inizializzare il campo prestato
        // scegliere se inizializzare direttamente nel attributo oppure dentro il costruttore
        this.prestato = false;
    }

    public Libro() {
    }

    public void presta( )  throws LibroGiaPrestatoException {
        logger.debug("richiesta di prestito del libro: " + titolo);
        logger.debug("l'attributo prestato è: " + prestato);

        if(prestato) {
            logger.debug("il libro {} {} è già stato prestato " , titolo, casaEditrice);
            throw new LibroGiaPrestatoException( "Il libro è già stato prestato - non è possibile prestarlo nuovamente: " + titolo);
        }
        logger.debug("Prestito effettuato");
        prestato= true;
    }


}
