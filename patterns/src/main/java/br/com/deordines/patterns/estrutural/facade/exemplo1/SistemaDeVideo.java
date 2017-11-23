package main.java.br.com.deordines.patterns.estrutural.facade.exemplo1;

public class SistemaDeVideo {

    public void configurarCor() {
        System.out.println("Cor OK");
    }

    public void configurarContraste() {
        System.out.println("Contraste OK");
    }

    public void configurarResolusao() {
        System.out.println("Resolução OK");
    }

    public void aumentarBrilho() {
        System.out.println("Brilho +10");
    }

    public void diminuirBrilho() {
        System.out.println("Brilho -10");
    }
}
