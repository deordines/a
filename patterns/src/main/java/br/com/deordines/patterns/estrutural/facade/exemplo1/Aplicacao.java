package main.java.br.com.deordines.patterns.estrutural.facade.exemplo1;

/**
 * DESIGN PATTERN - FACADE
 *
 * CONCEITO:
 * Fornecer uma interface unificada para um conjunto de interfaces e definir as operações a serem realizadas.
 *
 * VANTAGENS:
 * Remover a complexidade do cliente;
 * Possibilidade de definir configurações personalizadas;
 *
 * DESVANTAGENS:
 * Crescimento anormal e descontrolado da classe facade.
 *
 */
public class Aplicacao {

    public static void main(String[] args) {
        SistemaFacade fachada = new SistemaFacade();
        System.out.println("Iniciando subssistemas\n");
        fachada.iniciarSubssistemas();

        System.out.println("\nUtilizando subssistemas\n");
        fachada.reproduzirAudio("musica.mp3");
        fachada.aumentarVolume();
        fachada.aumentarVolume();
        fachada.diminuirVolume();
        fachada.aumentarBrilho();
        fachada.aumentarBrilho();
        fachada.aumentarBrilho();
        fachada.diminuirBrilho();
        fachada.diminuirBrilho();
        fachada.diminuirBrilho();
    }
}
