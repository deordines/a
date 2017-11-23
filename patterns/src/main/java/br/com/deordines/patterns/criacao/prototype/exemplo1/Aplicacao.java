package main.java.br.com.deordines.patterns.criacao.prototype.exemplo1;

/**
 * DESIGN PATTERN - PROTOTYPE
 *
 * CONCEITO:
 * Especificar os tipos de objetos a serem criados utilizando uma classe protótipo e criar novos objetos através
 * dessa classe.
 *
 * VANTAGENS:
 * Baixo acoplamento;
 * Maior flexibilidade;
 * Fácil criação de novas objetos;
 * Utilização de objetos para instanciação ao invés da classe.
 *
 * DESVANTAGENS:
 * ###
 *
 */
public class Aplicacao {

    public static void main(String[] args) {
        UnoPrototipo unoPrototipo = new UnoPrototipo();

        CarroPrototipo unoNovo = unoPrototipo.clonar();
        unoNovo.setValor(20000);
        CarroPrototipo unoComEscada = unoPrototipo.clonar();
        unoComEscada.setValor(19999);

        System.out.println(unoNovo.exibirInfo());
        System.out.println(unoComEscada.exibirInfo());
    }
}
