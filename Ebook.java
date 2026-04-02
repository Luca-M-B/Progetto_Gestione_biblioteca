public class Ebook extends Risorsa {
    private String formato;

    public Ebook(String titolo, int annoPublicazione, String codice, String formato) {
        super(titolo, annoPublicazione, codice);
        this.formato = formato;
    }

    @Override
    void visualizzaDettagli() {
        System.out.println("\n| Titolo: " + getTitolo());
        System.out.println("| Anno Publicazione: " + getAnnoPublicazione());
        System.out.println("| Codice: " + getCodice());
        System.out.println("| Tipo formato: " + formato);
         System.out.println("--------------------------------------");
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

}
