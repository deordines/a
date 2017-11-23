package main.java.br.com.deordines.patterns.comportamental.mediator.exemplo1;

public interface Mediador {

    void receberMensagem(String mensagem);
    void enviarMensagem(String nome, String mensagem);
}