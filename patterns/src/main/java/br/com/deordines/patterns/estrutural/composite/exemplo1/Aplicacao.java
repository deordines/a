package main.java.br.com.deordines.patterns.estrutural.composite.exemplo1;

/**
 * DESIGN PATTERN - COMPOSITE
 *
 * VANTAGENS:
 * Código simplificado;
 * Tratar objetos concretos e compostos uniformemente;
 * Facilidade na adição de novos objetos.
 *
 * DESVANTAGENS:
 * Código genérico demais;
 * Tipagem não detecta composições erradas.
 *
 */
public class Aplicacao {

    public static void main(String[] args) {
        Arquivo pasta = new ArquivoComposto("pasta");
        Arquivo novaPasta = new ArquivoComposto("nova pasta");
        Arquivo video = new ArquivoVideo("meu video", ".mkv");
        Arquivo imagem = new ArquivoImagem("minha foto", ".jpg");

        try {
            System.out.println("\n1 - Adicionando arquivo dentro de outro arquivo:");
            video.adicionar(video);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n2 - Adicionando arquivos dentro da pasta:");
            pasta.adicionar(video);
            pasta.adicionar(video);
            pasta.adicionar(imagem);
            pasta.adicionar(imagem);
            pasta.adicionar(novaPasta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n3 - Pesquisando arquivo inexistente dentro da pasta:");
            pasta.getArquivo("q").stream().forEach(t -> t.printNomeDoArquivo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n4 - Pesquisando arquivo existente dentro da pasta:");
            pasta.getArquivo("a").stream().forEach(t -> t.printNomeDoArquivo());

            System.out.println("\n5 - Removendo arquivo da pasta:");
            pasta.remover(novaPasta);

            System.out.println("\n6 - Pesquisando arquivo existente dentro da pasta:");
            pasta.getArquivo("a").stream().forEach(t -> t.printNomeDoArquivo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
