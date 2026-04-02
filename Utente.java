import java.util.ArrayList;

public class Utente {

    private String idUtente;
    private static int contatore = 0; // per generare id
    private String nome;
    private ArrayList<Risorsa> risorsePrese;

    public Utente(String nome) {
        this.nome = nome;
        this.idUtente = "UT-000" + (++contatore);
        this.risorsePrese = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getIdUtente() {
        return idUtente;
    }

    public void prendiInPrestito(Risorsa risorsa) {
        if (risorsa != null && !risorsePrese.contains(risorsa)) {
            risorsePrese.add(risorsa);
            System.out.println(nome + " ha preso in prestito: " + risorsa);
        } else {
            System.out.println("Risorsa non valida.");
        }
    }

    public void restituisciRisorsa(Risorsa risorsa) {
        if (risorsePrese.remove(risorsa)) {
            System.out.println(nome + " ha restituito: " + risorsa);
        } else {
            System.out.println("Risorsa non trovata tra i prestiti.");
        }
    }

    public void stampaRisorse() {
        System.out.println("Risorse di " + nome + ":");

        if (risorsePrese.isEmpty()) {
            System.out.println("Nessuna risorsa in prestito.");
        } else {
            for (Risorsa r : risorsePrese) {
                System.out.println("- " + r);
            }
        }
    }

}
