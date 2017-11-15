package main.java.br.com.deordines.patterns.estrutural.decorator.exemplo1;

public abstract class Item {

    protected String nome;
    protected double preco;

    protected Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected double getPreco() {
        return preco;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }
}
