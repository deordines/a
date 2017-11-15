package main.java.br.com.deordines.patterns.comportamental.iterator.exemplo1;

public class IteratorMatriz implements IIterator {

    private Canal[] canais;
    private int posicao;

    public IteratorMatriz(Canal[] canais) {
        this.canais = canais;
        this.posicao = 0;
    }

    @Override
    public Canal first() {
        return canais[0];
    }

    @Override
    public Canal next() {
        Canal canal = canais[posicao];
        posicao++;
        return canal;
    }

    @Override
    public boolean hasNext() {
        return posicao < canais.length;
    }
}
