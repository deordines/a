package main.java.br.com.deordines.patterns.estrutural.decorator.exemplo1;

public class ItemDecorator extends Item {

    Item item;

    protected ItemDecorator(Item item) {
        super(item.nome, item.preco);
        this.item = item;
    }

    @Override
    protected String getNome() {
        return String.format("%s + %s", item.getNome(), nome);
    }

    @Override
    protected double getPreco() {
        return item.getPreco() + preco;
    }
}
