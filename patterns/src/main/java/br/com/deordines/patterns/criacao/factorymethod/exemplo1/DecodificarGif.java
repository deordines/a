package main.java.br.com.deordines.patterns.criacao.factorymethod.exemplo1;

public class DecodificarGif extends Decodificar {

    public DecodificarGif() {
        super(".gif", "Sou um arquivo GIF.");
    }

    @Override
    public Decodificar getArquivoDecodificado() {
        System.out.println("\nDecodificando arquivo " + this.extensao + ": " + this.conteudo);
        return this;
    }
}
