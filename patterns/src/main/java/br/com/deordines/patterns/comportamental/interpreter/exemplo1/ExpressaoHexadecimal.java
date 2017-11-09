package main.java.br.com.deordines.patterns.comportamental.interpreter.exemplo1;

public class ExpressaoHexadecimal extends Expressao {

    @Override
    public Contexto interpretar(Contexto contexto) {
        System.out.println("\nConverter inteiro para hexadecimal.");
        System.out.println("Número: "+ contexto.getEntrada());
        contexto.setSaida(Integer.toHexString(contexto.getEntrada()));
        System.out.print("Hexadecimal: ");
        return contexto;
    }
}
