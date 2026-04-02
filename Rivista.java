public class Rivista extends Risorsa {
    private int numeroRivista;

    public Rivista(String titolo, int annoPublicazione, String codice, int numero_rivista) {
        super(titolo, annoPublicazione, codice);
        this.numeroRivista = numero_rivista;
    }

    @Override
    public void visualizzaDettagli() {
        System.out.println("\n| Titolo: " + getTitolo());
        System.out.println("| Anno Publicazione: " + getAnnoPublicazione());
        System.out.println("| Codice: " + getCodice());
        System.out.println("| Numero Rivista: " + numeroRivista);
        System.out.println("--------------------------------------");
    }

    public int getNumero_rivista() {
        return numeroRivista;
    }

    public void setNumero_rivista(int numero_rivista) {
        this.numeroRivista = numero_rivista;
    }

}
