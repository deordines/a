package main.java.br.com.deordines.patterns.criacao.factorymethod.exemplo1;

public abstract class Decodificar implements IDecodificador {

    protected String extensao;
    protected String conteudo;

    protected Decodificar(String extensao, String conteudo) {
        this.extensao = extensao;
        this.conteudo = conteudo;
    }
}
