public class Libro extends Risorsa
{

    private String autore;

    public Libro(String titolo,int annoPublicazione,String codice,String autore) {
        super(titolo, annoPublicazione, codice);
        this.autore=autore;
    }

    @Override
     void visualizzaDettagli()
    {
        System.out.println("\n| Titolo: "+getTitolo());
        System.out.println("| Anno Publicazione: "+getAnnoPublicazione());
        System.out.println("| Codice: "+getCodice());
        System.out.println("| Autore"+autore);
         System.out.println("--------------------------------------");
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String Autore) {
        this.autore = Autore;
    }
    
    
}
