public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblio");

        Utente utente1 = new Utente("Pippo");
        Utente utente2 = new Utente("Ugo");

        Libro libro1 = new Libro("titolo", 2000, "codice", "autore");
        Libro libro2 = new Libro("titolo2", 2000, "codice2", "autore2");
        Libro libro3 = new Libro("titolo3", 2000, "codice3", "autore3");

        Ebook ebook1 = new Ebook("titolo", 2000, "codice", "pdf");
        Ebook ebook2 = new Ebook("titolo2", 2000, "codice2", "pdf");

        Rivista rivista1 = new Rivista("titolo", 2000, "codice", 1);
        Rivista rivista2 = new Rivista("titolo2", 2000, "codice2", 2);
        Rivista rivista3 = new Rivista("titolo3", 2000, "codice3", 3);

        biblioteca.aggiungiUtente(utente1);
        biblioteca.aggiungiUtente(utente2);

        biblioteca.aggiungiRisorsa(libro1);
        biblioteca.aggiungiRisorsa(libro2);
        biblioteca.aggiungiRisorsa(libro3);
        biblioteca.aggiungiRisorsa(ebook2);
        biblioteca.aggiungiRisorsa(ebook1);
        biblioteca.aggiungiRisorsa(rivista1);
        biblioteca.aggiungiRisorsa(rivista2);
        biblioteca.aggiungiRisorsa(rivista3);

        biblioteca.stampaInventario();

    }
}
