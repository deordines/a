package main.java.br.com.deordines.patterns.comportamental.mediator.exemplo1;

public class Piloto {

    private String nome;
    private TorreDeControle torreDeControle;

    public Piloto(String nome, TorreDeControle torreDeControle) {
        this.nome = nome;
        this.torreDeControle = torreDeControle;
    }

    public void enviarMensagem(String mensagem) {
        torreDeControle.receberMensagem(String.format("%s para Torre De Controle: %s", nome, mensagem));
    }

    public String getNome() {
        return nome;
    }
}
