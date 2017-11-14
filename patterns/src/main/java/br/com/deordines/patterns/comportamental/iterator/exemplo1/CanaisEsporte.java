package main.java.br.com.deordines.patterns.comportamental.iterator.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class CanaisEsporte implements Canais {

    private List<Canal> canais;

    public CanaisEsporte() {
        this.canais = new ArrayList<>();
        canais.add(new Canal("Campeonato Brasileiro"));
        canais.add(new Canal("Campeonato Espanhol"));
        canais.add(new Canal("Campeonato Italiano"));
    }

    @Override
    public IIterator criarIterator() {
        return new IteradorLista(canais);
    }
}
