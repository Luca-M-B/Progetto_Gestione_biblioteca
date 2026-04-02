public abstract class Risorsa {
    private String titolo;
    private int annoPublicazione;
    private String codice;
    private boolean prestito;

    public Risorsa(String titolo, int annoPublicazione, String codice) {
        this.titolo = titolo;
        this.annoPublicazione = annoPublicazione;
        this.codice = codice;
        this.prestito = false;
    }

    public abstract void visualizzaDettagli();

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

    public boolean isPrestito() {
        return prestito;
    }

    public void setPrestito(boolean prestito) {

        this.prestito = prestito;
    }



    @Override
    public String toString() {
        return titolo + " (" + codice + ")";
    }

}

