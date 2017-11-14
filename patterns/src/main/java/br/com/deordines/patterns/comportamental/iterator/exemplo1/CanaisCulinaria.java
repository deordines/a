package main.java.br.com.deordines.patterns.comportamental.iterator.exemplo1;

public class CanaisCulinaria implements Canais {

    private Canal[] canais;

    public CanaisCulinaria() {
        this.canais = new Canal[3];
        canais[0] = new Canal("MasterChef");
        canais[1] = new Canal("Mais Você");
        canais[2] = new Canal("");
    }

    @Override
    public IIterator criarIterator() {
        return new IteratorMatriz(canais);
    }
}
