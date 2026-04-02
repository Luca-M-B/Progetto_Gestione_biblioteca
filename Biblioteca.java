import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private ArrayList<Risorsa> risorseDisponibili;
    private ArrayList<Utente> utentiIscritti;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.risorseDisponibili = new ArrayList<>();
        this.utentiIscritti = new ArrayList<>();
    }

    public void aggiungiRisorsa(Risorsa risorsa) {
        if (risorsa != null) {
            risorseDisponibili.add(risorsa);
        }
    }

    public void aggiungiUtente(Utente utente) {
        if (utente != null) {
            utentiIscritti.add(utente);
        }
    }

    public void stampaInventario() {
        System.out.println("Inventario biblioteca " + nome + ":\n");

        if (risorseDisponibili.isEmpty()) {
            System.out.println("Nessuna risorsa disponibile.");
        } else {
            for (Risorsa risorsa : risorseDisponibili) {
                risorsa.visualizzaDettagli();
            }
        }
    }

    public ArrayList<Risorsa> cercaPerTitolo(String titolo) {
        ArrayList<Risorsa> risultati = new ArrayList<>();

        for (Risorsa risorsa : risorseDisponibili) {
            if (risorsa.getTitolo().equalsIgnoreCase(titolo)) {
                risultati.add(risorsa);
            }
        }

        return risultati;
    }

    public void prestaRisorsa(Utente utente, Risorsa risorsa) {
        if (utentiIscritti.contains(utente) && risorseDisponibili.contains(risorsa)) {
            utente.prendiInPrestito(risorsa);
        } else {
            System.out.println("Utente o risorsa non validi.");
        }
    }

}