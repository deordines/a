package main.java.br.com.deordines.patterns.criacao.prototype.exemplo1;

public abstract class CarroPrototipo {

    protected double valor;

    protected abstract String exibirInfo();

    protected abstract CarroPrototipo clonar();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
