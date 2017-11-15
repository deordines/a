package main.java.br.com.deordines.patterns.comportamental.iterator.exemplo1;

import java.util.List;

public class IteradorLista implements IIterator {

    private List<Canal> canais;
    private int posicao;

    public IteradorLista(List<Canal> canais) {
        this.canais = canais;
        this.posicao = 0;
    }

    @Override
    public Canal first() {
        return canais.get(0);
    }

    @Override
    public Canal next() {
        Canal canal = canais.get(posicao);
        posicao++;
        return canal;
    }

    @Override
    public boolean hasNext() {
        return posicao < canais.size();
    }
}
