{\rtf1}
/*
Abbiamo provato a gestire il sistema di archiviazione, prestito e restituzione di una biblioteca.
Come extra avremmo voluto gestire dei piccoli controlli:
1 ogni utente per poter ottenere in prestito una risorsa sarebbe dovuto essere iscritto alla biblioteca
2 ogni utente iscritto avrebbe potuto prendere in prestito un massimo di 3 risorse contemporaneamente
3 dopo aver noleggiato 10 risorse, l'utente sarebbe salito di livello e avrebbe potuto ottenere in
    prestito fino a 5 risorse contemporaneamente
4 l'archiviazione in biblioteca avrebbe potuto gestire anche piu copie di una risorsa ma solo 
    in formato cartaceo (no Ebook)

Divisione dei compiti:
    Donato ha creato le classi Risorsa e le sue figlie, concentrandosi poi sullo sviluppo del 
        menu nel main
    Luca ha creato le classi Utente e Biblioteca e implementato i controlli in tutte le classi
*/