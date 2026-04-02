public class Rivista extends Risorsa {
    private int numero_rivista;

    public Rivista(String titolo, int annoPublicazione, String codice, int numero_rivista) {
        super(titolo, annoPublicazione, codice);
        this.numero_rivista = numero_rivista;
    }

    @Override
    void visualizzaDettagli() {
        System.out.println("Titolo: " + getTitolo());
        System.out.println("Anno Publicazione: " + getAnnoPublicazione());
        System.out.println("Codice: " + getCodice());
        System.out.println("Numero Rivista: " + numero_rivista);
    }

    public int getNumero_rivista() {
        return numero_rivista;
    }

    public void setNumero_rivista(int numero_rivista) {
        this.numero_rivista = numero_rivista;
    }

}
