package it.epicode;

public class MainNumeriCasuali {
    public static void main(String[] args) {

        // creo un numero casuale tra 1 e 100
        int numeroCasuale = (int) (Math.random() * 100) + 1;

        System.out.println("Il numero casuale è: " + numeroCasuale);

    }
}
