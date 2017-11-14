package main.java.br.com.deordines.patterns.comportamental.iterator.exemplo1;

public class IteratorMatriz implements IIterator {

    private Canal[] canais;
    private int contador;

    public IteratorMatriz(Canal[] canais) {
        this.canais = canais;
        this.contador = 0;
    }

    @Override
    public void first() {
        contador = 0;
    }

    @Override
    public void next() {
        contador++;
    }

    @Override
    public boolean isDone() {
        return contador == canais.length;
    }

    @Override
    public Canal currentItem() {
        if (isDone()) {
            contador = canais.length - 1;
        } else  if (contador < 0) {
            contador = 0;
        }
        return canais[contador];
    }
}
