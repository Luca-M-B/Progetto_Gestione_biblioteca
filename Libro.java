public class Libro extends Risorsa {

    private static int contatore = 0;
    private String autore;

    public Libro(String titolo, int annoPublicazione, String autore) {
        super(titolo, annoPublicazione, generaCodice());

        if (autore == null || autore.trim().isEmpty()) {
            this.autore = "Autore sconosciuto";
        } else {
            this.autore = autore;
        }
    }

    private static String generaCodice() {
        return String.format("LI-%03d", ++contatore);
    }

    @Override
    public void visualizzaDettagli() {
        System.out.println("\n| " + super.toString());
        System.out.println("| Anno Pubblicazione: " + getAnnoPublicazione());
        System.out.println("| Autore: " + autore);
        System.out.println("--------------------------------------");
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        if (autore != null && !autore.trim().isEmpty()) {
            this.autore = autore;
        } else {
            System.out.println("Autore non valido. Operazione ignorata.");
        }
    }
}