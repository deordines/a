package main.java.br.com.deordines.patterns.comportamental.interpreter.exemplo1;

public class Contexto {

    private int entrada;
    private String saida;

    public Contexto(int entrada) {
        this.entrada = entrada;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }
}
