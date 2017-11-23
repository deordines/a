package main.java.br.com.deordines.patterns.criacao.prototype.exemplo1;

public class UnoPrototipo extends CarroPrototipo {

    public UnoPrototipo() {
        valor = 0;
    }

    @Override
    protected String exibirInfo() {
        return String.format("Carro: Uno. Valor: R$%s", getValor());
    }

    @Override
    protected CarroPrototipo clonar() {
        return new UnoPrototipo();
    }
}
