package main.java.br.com.deordines.patterns.comportamental.iterator.exemplo1;

public class CanaisCulinaria implements Canais {

    private Canal[] canais;

    public CanaisCulinaria() {
        this.canais = new Canal[]{
                new Canal("MasterChef"),
                new Canal("Mais Você")
        };
    }

    @Override
    public IIterator criarIterator() {
        return new IteratorMatriz(canais);
    }
}
