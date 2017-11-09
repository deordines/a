package main.java.br.com.deordines.patterns.comportamental.interpreter.exemplo1;

/**
 * DESIGN PATTERNS - INTERPRETER
 *
 * CONCEITO:
 * Definir uma representação de gramática e um interpretador que se baseará nessa representação para interpretar a linguagem.
 *
 * VANTAGENS:
 * Fácil extensão;
 * Fácil implementação de novas regras.
 *
 * DESVANTAGENS:
 * Dificuldade em modelar a gramática a ser utilizada.
 *
 */
public class Aplicacao {

    public static void main(String[] args) {
        Expressao expressao = null;
        Contexto contexto = new Contexto(170);

        expressao = new ExpressaoBinaria();
        System.out.println(expressao.interpretar(contexto).getSaida());

        expressao = new ExpressaoHexadecimal();
        System.out.println(expressao.interpretar(contexto).getSaida());
    }
}
