package main.java.br.com.deordines.patterns.estrutural.facade.exemplo1;

public class SistemaFacade {

    private SistemaDeAudio audio;
    private SistemaDeInput input;
    private SistemaDeVideo video;

    public void iniciarSubssistemas() {
        System.out.println("Configurar sistemas de audio");
        audio = new SistemaDeAudio();
        audio.configurarVolume();
        audio.configurarFormato();

        System.out.println("\nConfigurar sistemas de input");
        input = new SistemaDeInput();
        input.configurarControle();
        input.configurarTeclado();

        System.out.println("\nConfigurar sistemas de vídeo");
        video = new SistemaDeVideo();
        video.configurarContraste();
        video.configurarCor();
        video.configurarResolusao();
    }

    public void reproduzirAudio(String arquivo) {
        audio.reproduzirSom(arquivo);
    }

    public void aumentarVolume() {
        audio.aumentarVolume();
    }

    public void diminuirVolume() {
        audio.diminuirVolume();
    }

    public void diminuirBrilho() {
        video.diminuirBrilho();
    }

    public void aumentarBrilho() {
        video.aumentarBrilho();
    }
}
