il progetto serve a gestire il prestito di un libro
il libro ha i seguenti attributi

titolo
anno di pubblicazione
autore
genere
casaEditrice
prestato true nel caso il libro sia stato prestato, altrimenti false. il default è false

la gestione del prestito viene fatta in una classe Main che contiena lo logica stessa di prestito

il libro avrà un metodo presta che consentirà di gestiro il prestito
ma che lancerà un eccezione se io cerco di prestare un libro già dato

le classi necessarie saranno

Libro
LibroGiaPrestatoException
Main
