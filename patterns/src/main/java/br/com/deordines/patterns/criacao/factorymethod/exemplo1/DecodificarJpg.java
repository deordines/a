package main.java.br.com.deordines.patterns.criacao.factorymethod.exemplo1;

public class DecodificarJpg extends Decodificar {

    public DecodificarJpg() {
        super(".jpg", "Sou um arquivo JPG.");
    }

    @Override
    public Decodificar getArquivoDecodificado() {
        System.out.println("\nDecodificando arquivo " + this.extensao + ": " + this.conteudo);
        return this;
    }
}
