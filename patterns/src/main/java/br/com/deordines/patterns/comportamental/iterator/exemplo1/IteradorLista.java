package main.java.br.com.deordines.patterns.comportamental.iterator.exemplo1;

import java.util.List;

public class IteradorLista implements IIterator {

    private List<Canal> canais;
    private int contador;

    public IteradorLista(List<Canal> canais) {
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
        return contador == canais.size();
    }

    @Override
    public Canal currentItem() {
        if (isDone()) {
            contador = canais.size() - 1;
        } else  if (contador < 0) {
            contador = 0;
        }
        return canais.get(contador);
    }
}
