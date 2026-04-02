public class Risorsa 
{
    private String titolo;
    private int annoPublicazione;
    private String codice;

    public Risorsa(String titolo,int annoPublicazione,String codice) 
    {
        this.titolo=titolo;
        this.annoPublicazione=annoPublicazione;
        this.codice=codice;
    }

    void visualizzaDettagli()
    {
        System.out.println("Titolo: "+titolo );
        System.out.println("Anno Publicazione: "+annoPublicazione );
        System.out.println("Codice: "+codice);
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPublicazione() {
        return annoPublicazione;
    }

    public void setAnnoPublicazione(int annoPublicazione) {
        this.annoPublicazione = annoPublicazione;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }


}
