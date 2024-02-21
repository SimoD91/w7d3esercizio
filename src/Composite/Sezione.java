package Composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements CompositeInterface {
    private String titolo;
    private List<CompositeInterface> componenti = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungi(CompositeInterface componente) {
        componenti.add(componente);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
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