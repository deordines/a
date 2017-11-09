package main.java.br.com.deordines.patterns.criacao.factorymethod.exemplo1;

/**
 * DESIGN PATTERNS - FACTORY METHOD
 *
 * CONCEITO:
 * Passar a responsabilidade de instanciação para subclasses.
 *
 * VANTAGENS:
 * Definir uma interface para criar os objetos;
 * Baixo acoplamento;
 * Maior flexibilidade;
 * Fácil inserção de novas classes.
 *
 * DESVANTAGENS:
 * Alto número de classes criadas.
 *
 */
public class Aplicacao {

    public static void main(String[] args) {
        IDecodificador iDecodificador = null;
        Decodificar decodificar = null;

        iDecodificador = new DecodificarGif();
        decodificar = iDecodificador.getArquivoDecodificado();

        iDecodificador = new DecodificarJpg();
        decodificar = iDecodificador.getArquivoDecodificado();

        iDecodificador = new DecodificarPdf();
        decodificar = iDecodificador.getArquivoDecodificado();

        //iDecodificador = new DecodificarDesconhecido();
    }
}
