package main.java.br.com.deordines.patterns.comportamental.iterator.exemplo1;

import java.util.Arrays;
import java.util.List;

public class CanaisEsporte implements Canais {

    private List<Canal> canais;

    public CanaisEsporte() {
        this.canais = Arrays.asList(
            new Canal("Campeonato Brasileiro"),
            new Canal("Campeonato Espanhol"),
            new Canal("Campeonato Italiano")
        );
    }

    @Override
    public IIterator criarIterator() {
        return new IteradorLista(canais);
    }
}
