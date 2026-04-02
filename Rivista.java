public class Rivista extends Risorsa {

    private static int contatore = 0;
    private int numeroRivista;

    public Rivista(String titolo, int annoPublicazione, int numeroRivista) {
        super(titolo, annoPublicazione, generaCodice());

        if (numeroRivista <= 0) {
            this.numeroRivista = 1;
        } else {
            this.numeroRivista = numeroRivista;
        }
    }

    private static String generaCodice() {
        return String.format("RI-%03d", ++contatore);
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