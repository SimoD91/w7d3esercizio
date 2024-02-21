package Composite;

public class Pagina implements CompositeInterface {
        private String contenuto;

    public Pagina(String contenuto) {
            this.contenuto = contenuto;
        }

        @Override
        public void stampa() {
            System.out.println("Pagina: " + contenuto);
        }
    @Override
    public int getNumeroPagine() {
        return 1;
    }
    }
