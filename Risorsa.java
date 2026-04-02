public abstract class Risorsa {

    private String titolo;
    private int annoPublicazione;
    private final String codice;
    private boolean prestito;

    public Risorsa(String titolo, int annoPublicazione, String codice) {

        if (titolo == null || titolo.trim().isEmpty()) {
            this.titolo = "Titolo non valido";
        } else {
            this.titolo = titolo;
        }

        if (annoPublicazione < 1900) {
            this.annoPublicazione = 1900;
        } else {
            this.annoPublicazione = annoPublicazione;
        }

        if (codice == null || codice.trim().isEmpty()) {
            this.codice = "N/A";
        } else {
            this.codice = codice;
        }

        this.prestito = false;
    }

    public abstract void visualizzaDettagli();

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPublicazione() {
        return annoPublicazione;
    }

    public String getCodice() {
        return codice;
    }

    public boolean isPrestito() {
        return prestito;
    }

    public boolean isDisponibile() {
        return !prestito;
    }

    public void setTitolo(String titolo) {
        if (titolo != null && !titolo.trim().isEmpty()) {
            this.titolo = titolo;
        } else {
            System.out.println("Titolo non valido. Operazione ignorata.");
        }
    }

    public void setAnnoPublicazione(int annoPublicazione) {
        if (annoPublicazione >= 1900) {
            this.annoPublicazione = annoPublicazione;
        } else {
            System.out.println("Anno non valido. Operazione ignorata.");
        }
    }

    public void presta() {
        if (!prestito) {
            prestito = true;
        } else {
            System.out.println("Risorsa già in prestito.");
        }
    }

    public void restituisci() {
        if (prestito) {
            prestito = false;
        } else {
            System.out.println("Risorsa non in prestito.");
        }
    }

    @Override
    public String toString() {
        return titolo + " (" + codice + ")";
    }

}
