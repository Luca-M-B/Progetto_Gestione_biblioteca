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

    void visualizzaDettagli() {
        System.out.println("\nTitolo: " + titolo);
        System.out.println(" || Anno Publicazione: " + annoPublicazione);
        System.out.println(" || Codice: " + codice);
        System.out.println(" || Prestito: " + prestito);
        System.out.println("--------------------------------------");
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

    public boolean isPrestito() {
        return prestito;
    }

    public void setPrestito(boolean prestito) {

        this.prestito = prestito;
    }

}

/*
 * if (!libro.inPrestito) { // verifico se dipsonibile
 * libro.inPrestito = true; // setto variabile a true
 * libro.dataPrestito = System.currentTimeMillis();
 * 
 * utente.libriPresi.add(libro);
 * 
 * System.out.println("Libro dato in prestito");
 * } else {
 * System.out.println("Libro già in prestito");
 * }
 */