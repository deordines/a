package main.java.br.com.deordines.patterns.comportamental.mediator.exemplo1;

/**
 * DESIGN PATTERNS - MEDIATOR
 *
 * CONCEITO:
 * Definir um objeto que encapsula a forma de como os objetos interagem.
 *
 * VANTAGENS:
 * Eliminar relacionamentos n para n;
 * Centralizar a comunicação;
 * Diminuir o acoplamento entre as classes "piloto".
 *
 * DESVANTAGENS:
 * Mediadores tendem a se tornar complexos.
 *
 */
public class Aplicacao {

    public static void main(String[] args) {
        TorreDeControle torreDeControle = new TorreDeControle();

        Piloto pilotoA = new Piloto("Santos", torreDeControle);
        Piloto pilotoB = new Piloto("Dummond", torreDeControle);

        pilotoA.enviarMensagem("Solicito autorização para decolagem.");
        torreDeControle.enviarMensagem(pilotoA.getNome(),"Aguarde.\n");
        pilotoB.enviarMensagem("Solicito autorização para pousar.");
        torreDeControle.enviarMensagem(pilotoB.getNome(),"Permitido.");
    }
}
