package main.java.br.com.deordines.patterns.criacao.factorymethod.exemplo1;

public class DecodificarPdf extends Decodificar {

    public DecodificarPdf() {
        super(".pdf", "Sou um arquivo PDF.");
    }

    @Override
    public Decodificar getArquivoDecodificado() {
        System.out.println("\nDecodificando arquivo " + this.extensao + ": " + this.conteudo);
        return this;
    }
}
