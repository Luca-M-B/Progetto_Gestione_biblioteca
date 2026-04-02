
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblio");
        /*
         * Libro libro1 = new Libro("titolo", 2000, "codice", "autore");
         * Libro libro2 = new Libro("titolo2", 2000, "codice2", "autore2");
         * Libro libro3 = new Libro("titolo3", 2000, "codice3", "autore3");
         * 
         * Ebook ebook1 = new Ebook("titolo", 2000, "codice", "pdf");
         * Ebook ebook2 = new Ebook("titolo2", 2000, "codice2", "pdf");
         * 
         * Rivista rivista1 = new Rivista("titolo", 2000, "codice", 1);
         * Rivista rivista2 = new Rivista("titolo2", 2000, "codice2", 2);
         * Rivista rivista3 = new Rivista("titolo3", 2000, "codice3", 3);
         * 
         * 
         * biblioteca.aggiungiUtente(utente2);
         * 
         * biblioteca.aggiungiRisorsa(libro1);
         * biblioteca.aggiungiRisorsa(libro2);
         * biblioteca.aggiungiRisorsa(libro3);
         * biblioteca.aggiungiRisorsa(ebook2);
         * biblioteca.aggiungiRisorsa(ebook1);
         * biblioteca.aggiungiRisorsa(rivista1);
         * biblioteca.aggiungiRisorsa(rivista2);
         * biblioteca.aggiungiRisorsa(rivista3);
         */

        boolean continua = true;
        Scanner myint = new Scanner(System.in);
        Scanner mystr = new Scanner(System.in);

        while (continua) {

            System.out.println("--Menu--");
            System.out.println("1 - Iscrizione nuovo Utente");
            System.out.println("2 - Inserisci risorsa ");
            System.out.println("3 - Stampa Risorse disponibili");
            System.out.println("4 - Gestisci Risorsa");
            System.out.println("5 - esci");

            System.out.println("Cosa vuoi fare?: ");

            int scelta = myint.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Dimmi nome utente");
                    String nome = mystr.nextLine();

                    Utente utente = new Utente(nome);

                    biblioteca.aggiungiUtente(utente);
                    System.out.println("Utente Aggiunto con successo");

                    break;

                case 2:

                    // inserire i libri riviste ed ebook
                    boolean cont = true;

                    while (cont) {

                        System.out.println("1 - Rivista");
                        System.out.println("2 - Libro ");
                        System.out.println("3 - Ebook");
                        System.out.println("4 - Torna al menu principale");

                        System.out.println("Cosa Vuoi inserire?: ");
                        int sc = myint.nextInt();

                        switch (sc) {
                            case 1:
                                // Aggiunta Rivista

                                System.out.println("Inserisci Titolo: ");
                                String titr = mystr.nextLine();

                                System.out.println("Inserisci anno di Publicazione");
                                int adp = myint.nextInt();

                                System.out.println("Inserisci Codice univoco");
                                String cod = mystr.nextLine();

                                System.out.println("Inserisci Numero Rivista: ");
                                int nriv = myint.nextInt();

                                Rivista riv = new Rivista(titr, adp, cod, nriv);
                                biblioteca.aggiungiRisorsa(riv);

                                System.out.println("Rivista aggiunto!");

                                break;

                            case 2:

                                // Aggiunta Libro
                                System.out.println("Inserisci Titolo: ");
                                String titl = mystr.nextLine();

                                System.out.println("Inserisci anno di Publicazione");
                                int adpl = myint.nextInt();

                                System.out.println("Inserisci Codice univoco");
                                String codl = mystr.nextLine();

                                System.out.println("Inserisci Nome Autore: ");
                                String nou = mystr.nextLine();

                                Libro lib = new Libro(titl, adpl, codl, nou);
                                biblioteca.aggiungiRisorsa(lib);

                                System.out.println("Libro aggiunto!");

                                break;

                            case 3:

                                // Aggiunta Ebook
                                System.out.println("Inserisci Titolo: ");
                                String tite = mystr.nextLine();

                                System.out.println("Inserisci anno di Publicazione");
                                int adpe = myint.nextInt();

                                System.out.println("Inserisci Codice univoco");
                                String code = mystr.nextLine();

                                System.out.println("Inserisci Tipo Formato: (PDF,EPUB)");
                                String form = mystr.nextLine();

                                Ebook eb = new Ebook(tite, adpe, code, form);
                                biblioteca.aggiungiRisorsa(eb);

                                System.out.println("Ebook aggiunto!");

                                break;

                            case 4:

                                // esci Switch interno
                                cont = false;
                                break;

                            default:
                                System.out.println("Caso non trovato");
                        }

                    }

                    break;

                case 3:
                    biblioteca.stampaInventario();
                    break;
                case 4:

                    break;

                case 5:
                    // esci Switch principale
                    System.out.println("Arrivederci");
                    continua = false;
                    break;

                default:
                    System.out.println("Caso non trovato");
            }

        }

        myint.close();
        mystr.close();

    }
}
