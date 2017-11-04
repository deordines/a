package main.java.br.com.deordines.patterns.comportamental.interpreter.exemplo1;

public class ExpressaoBinaria extends Expressao {

    @Override
    public String interpretar(Contexto contexto) {
        System.out.println("\nConverter inteiro para binário.");
        System.out.println("Número: "+ contexto.getEntrada());
        contexto.setSaida(Integer.toBinaryString(contexto.getEntrada()));
        System.out.print("Binário: ");
        return contexto.getSaida();
    }
}
