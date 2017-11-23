package main.java.br.com.deordines.patterns.estrutural.facade.exemplo1;

public class SistemaDeAudio {

    public void configurarVolume() {
        System.out.println("Volume OK");
    }

    public void configurarFormato() {
        System.out.println("Formato OK");
    }

    public void reproduzirSom(String arquivo) {
        System.out.println(String.format("Reproduzindo: %s", arquivo));
    }

    public void aumentarVolume() {
        System.out.println("Volume +10");
    }

    public void diminuirVolume() {
        System.out.println("Volume -10");
    }
}
