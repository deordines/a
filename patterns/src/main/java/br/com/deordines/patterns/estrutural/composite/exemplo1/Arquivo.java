package main.java.br.com.deordines.patterns.estrutural.composite.exemplo1;

import java.util.List;

public abstract class Arquivo {

    protected String nome;
    protected String extensao;

    protected Arquivo(String nome) {
        this.nome = nome;
    }

    protected Arquivo(String nome, String extensao) {
        this.nome = nome;
        this.extensao = extensao;
    }

    protected String getNomeDoArquivo() {
        return extensao == null ? nome : nome + extensao;
    }

    protected void printNomeDoArquivo() {
        System.out.println(nome + extensao);
    }

    protected void adicionar(Arquivo arquivo) throws Exception {
        throw new Exception(String.format("Não é possível adicionar o arquivo [%s]. Não é uma pasta.", getNomeDoArquivo()));
    }

    protected void remover(Arquivo arquivo) throws Exception {
        throw new Exception(String.format("Não é possível remover o arquivo [%s]. Não é uma pasta.", getNomeDoArquivo()));
    }

    protected List<Arquivo> getArquivo(String nomeDoArquivo) throws Exception {
        throw new Exception(String.format("Não é possível pesquisar o arquivo [%s]. Não é uma pasta.", getNomeDoArquivo()));
    }
}
