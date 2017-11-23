package main.java.br.com.deordines.patterns.comportamental.mediator.exemplo1;

public class TorreDeControle implements Mediador {

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    @Override
    public void enviarMensagem(String nome, String mensagem) {
        System.out.println(String.format("Torre de Controle para %s: %s", nome, mensagem));
    }
}
