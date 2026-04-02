public class Ebook extends Risorsa {

    private String formato;

    public Ebook(String titolo, int annoPublicazione, String codice, String formato) {
        super(titolo, annoPublicazione, codice);

        if (formato == null || formato.trim().isEmpty()) {
            this.formato = "Formato sconosciuto";
        } else {
            this.formato = formato;
        }
    }

    @Override
    public void visualizzaDettagli() {
        System.out.println("\n| " + super.toString());
        System.out.println("| Anno Pubblicazione: " + getAnnoPublicazione());
        System.out.println("| Formato: " + formato);
        System.out.println("--------------------------------------");
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        if (formato != null && !formato.trim().isEmpty()) {
            this.formato = formato;
        } else {
            System.out.println("Formato non valido. Operazione ignorata.");
        }
    }
}