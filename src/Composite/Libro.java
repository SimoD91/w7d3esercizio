package Composite;

import java.util.ArrayList;
import java.util.List;

public class Libro implements CompositeInterface {
    private String titolo;
    private List<CompositeInterface> componenti = new ArrayList<>();
    private List<String> autori = new ArrayList<>();
    private double prezzo;

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public void aggiungi(CompositeInterface componente) {
        componenti.add(componente);
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    @Override
    public void stampa() {
        System.out.println("Libro: " + titolo);
        System.out.println("Autori: " + autori);
        System.out.println("Prezzo: " + prezzo);
        for (CompositeInterface componente : componenti) {
            componente.stampa();
        }
    }
    @Override
    public int getNumeroPagine() {
        int numeroPagine = 0;
        for (CompositeInterface componente : componenti) {
            numeroPagine += componente.getNumeroPagine();
        }
        return numeroPagine;
    }
}