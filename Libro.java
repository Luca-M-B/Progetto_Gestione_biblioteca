public class Libro extends Risorsa {

    private String autore;

    public Libro(String titolo, int annoPublicazione, String codice, String autore) {
        super(titolo, annoPublicazione, codice);

        if (autore == null || autore.trim().isEmpty()) {
            this.autore = "Autore sconosciuto";
        } else {
            this.autore = autore;
        }
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