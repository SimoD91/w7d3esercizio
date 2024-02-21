package Composite;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Le guide del tramonto", 20.0);
        libro.aggiungiAutore("Autore 1");
        libro.aggiungiAutore("Autore 2");
        libro.aggiungiAutore("Autore 3");

        Pagina pagina1 = new Pagina("Pagina 1");
        Pagina pagina2 = new Pagina("Pagina 2");

        Sezione sezione1 = new Sezione("Sezione 1");
        sezione1.aggiungi(pagina1);
        sezione1.aggiungi(pagina2);

        Sezione sezione2 = new Sezione("Sezione 2");
        sezione2.aggiungi(new Pagina("Pagina 3"));

        libro.aggiungi(sezione1);
        libro.aggiungi(sezione2);

        libro.stampa();

        System.out.println("Totale pagine del libro: " + libro.getNumeroPagine());
    }
}
