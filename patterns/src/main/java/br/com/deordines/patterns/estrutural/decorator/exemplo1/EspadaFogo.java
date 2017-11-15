package main.java.br.com.deordines.patterns.estrutural.decorator.exemplo1;

public class EspadaFogo extends ItemDecorator {

    protected EspadaFogo(Item item) {
        super(item);
        nome = "Espada Fogo";
        preco = 100;
    }
}
