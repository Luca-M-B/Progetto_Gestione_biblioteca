public class Ebook extends Risorsa {

    private static int contatore = 0;
    private String formato;

    public Ebook(String titolo, int annoPublicazione, String formato) {
        super(titolo, annoPublicazione, generaCodice());

        if (formato == null || formato.trim().isEmpty()) {
            this.formato = "Formato sconosciuto";
        } else {
            this.formato = formato;
        }
    }

    private static String generaCodice() {
        return String.format("EB-%03d", ++contatore);
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