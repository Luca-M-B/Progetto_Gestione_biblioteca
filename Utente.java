import java.util.ArrayList;

public class Utente {

    private String idUtente;
    private static int contatore = 0;
    private String nome;
    private ArrayList<Risorsa> risorsePrese;

    public Utente(String nome) {

        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Utente sconosciuto";
        } else {
            this.nome = nome;
        }

        this.idUtente = String.format("UT-%03d", ++contatore);
        this.risorsePrese = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getIdUtente() {
        return idUtente;
    }

    public void prendiInPrestito(Risorsa risorsa) {
        if (risorsa != null && !risorsePrese.contains(risorsa) && risorsa.isDisponibile()) {

            risorsePrese.add(risorsa);
            risorsa.presta();

            System.out.println(nome + " ha preso in prestito: " + risorsa.getTitolo());
        } else {
            System.out.println("Risorsa non disponibile.");
        }
    }

    public void restituisciRisorsa(Risorsa risorsa) {
        if (risorsePrese.remove(risorsa)) {

            risorsa.restituisci();

            System.out.println(nome + " ha restituito: " + risorsa.getTitolo());
        } else {
            System.out.println("Risorsa non trovata tra i prestiti.");
        }
    }

    public void stampaRisorse() {
        System.out.println("\nRisorse di " + nome + " (" + idUtente + "):");

        if (risorsePrese.isEmpty()) {
            System.out.println("Nessuna risorsa in prestito.");
        } else {
            for (Risorsa r : risorsePrese) {
                r.visualizzaDettagli();
            }
        }
    }
}