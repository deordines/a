package main.java.br.com.deordines.patterns.estrutural.decorator.exemplo1;

/**
 * DESIGN PATTERN - DECORATOR
 *
 * CONCEITO:
 * Modificar a funcionalidade de um objeto em tempo de execução.
 *
 * VANTAGENS:
 * Adicionar comportamentos específicos a objetos dinamicamente;
 * Impedir a criação de subclasses para todas as combinações de comportamentos
 * Alta flexibilidade;
 * Alta coesão;
 * Baixo acoplamento.
 *
 * DESVANTAGENS:
 * Alto número de classes pequenas.
 *
 */
public class Aplicacao {

    public static void main(String[] args) {

        Item espada = new Espada("Espada Padrão", 10);
        System.out.println(String.format("\nNome: %s \nPreço: %s", espada.getNome(), espada.getPreco()));

        espada = new EspadaFogo(espada);
        System.out.println(String.format("\nNome: %s \nPreço: %s", espada.getNome(), espada.getPreco()));

        espada = new EspadaLongoAlcance(espada);
        System.out.println(String.format("\nNome: %s \nPreço: %s", espada.getNome(), espada.getPreco()));
    }
}
