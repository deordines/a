package main.java.br.com.deordines.patterns.estrutural.decorator.exemplo1;

public class EspadaLongoAlcance extends ItemDecorator {

    protected EspadaLongoAlcance(Item item) {
        super(item);
        nome = "Espada Longo Alcance";
        preco = 40;
    }
}
