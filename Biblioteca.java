import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private ArrayList<Risorsa> risorseDisponibili;
    private ArrayList<Utente> utentiIscritti;

    public Biblioteca(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Biblioteca";
        } else {
            this.nome = nome;
        }

        this.risorseDisponibili = new ArrayList<>();
        this.utentiIscritti = new ArrayList<>();
    }

    public void aggiungiRisorsa(Risorsa risorsa) {
        if (risorsa != null && !risorseDisponibili.contains(risorsa)) {
            risorseDisponibili.add(risorsa);
        }
    }

    public void aggiungiUtente(Utente utente) {
        if (utente != null && !utentiIscritti.contains(utente)) {
            utentiIscritti.add(utente);
        }
    }

    public void stampaInventario() {
        System.out.println("\nInventario biblioteca " + nome + ":\n");

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

        if (titolo != null) {
            for (Risorsa risorsa : risorseDisponibili) {
                if (risorsa.getTitolo().toLowerCase().contains(titolo.toLowerCase())) {
                    risultati.add(risorsa);
                }
            }
        }

        return new ArrayList<>(risultati);
    }

    public void prestaRisorsa(Utente utente, Risorsa risorsa) {
        if (utentiIscritti.contains(utente) && risorseDisponibili.contains(risorsa)) {

            if (risorsa.isDisponibile()) {
                utente.prendiInPrestito(risorsa);
            } else {
                System.out.println("Risorsa già in prestito.");
            }

        } else {
            System.out.println("Utente o risorsa non validi.");
        }
    }

    public void restituisciRisorsa(Utente utente, Risorsa risorsa) {
        if (utentiIscritti.contains(utente)) {
            utente.restituisciRisorsa(risorsa);
        } else {
            System.out.println("Utente non valido.");
        }
    }
}