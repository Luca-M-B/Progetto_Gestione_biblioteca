public class Rivista extends Risorsa {

    private int numeroRivista;

    public Rivista(String titolo, int annoPublicazione, String codice, int numeroRivista) {
        super(titolo, annoPublicazione, codice);

        if (numeroRivista <= 0) {
            this.numeroRivista = 1;
        } else {
            this.numeroRivista = numeroRivista;
        }
    }

    @Override
    public void visualizzaDettagli() {
        System.out.println("\n| " + super.toString());
        System.out.println("| Anno Pubblicazione: " + getAnnoPublicazione());
        System.out.println("| Numero Rivista: " + numeroRivista);
        System.out.println("--------------------------------------");
    }

    public int getNumeroRivista() {
        return numeroRivista;
    }

    public void setNumeroRivista(int numeroRivista) {
        if (numeroRivista > 0) {
            this.numeroRivista = numeroRivista;
        } else {
            System.out.println("Numero rivista non valido. Operazione ignorata.");
        }
    }
}