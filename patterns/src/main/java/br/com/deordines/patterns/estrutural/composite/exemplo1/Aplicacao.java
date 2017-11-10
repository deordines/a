package main.java.br.com.deordines.patterns.estrutural.composite.exemplo1;

import java.util.Arrays;
import java.util.List;

/**
 * DESIGN PATTERN - COMPOSITE
 *
 * CONCEITO:
 * Permitir que os clientes tratem objetos individuais e compostos uniformemente.
 *
 * VANTAGENS:
 * Código simplificado;
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

        System.out.println("\n1 - Adicionando arquivo dentro de outro arquivo:");
        adicionar(video, video);

        System.out.println("\n2 - Adicionando arquivos dentro da pasta:");
        List<Arquivo> lista = Arrays.asList(video, video, imagem, imagem, novaPasta);
        adicionar(pasta, lista);

        System.out.println("\n3 - Pesquisando arquivo inexistente dentro da pasta:");
        pesquisar(pasta, "q");

        System.out.println("\n4 - Pesquisando arquivo existente dentro da pasta:");
        pesquisar(pasta, "a");

        System.out.println("\n5 - Removendo arquivo da pasta:");
        remover(pasta, novaPasta);

        System.out.println("\n6 - Pesquisando arquivo existente dentro da pasta:");
        pesquisar(pasta, "a");
    }

    private static void adicionar(Arquivo pasta, Arquivo arquivo) {
        try {
            pasta.adicionar(arquivo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void adicionar(Arquivo pasta, List<Arquivo> arquivos) {
        try {
            pasta.adicionar(arquivos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void pesquisar(Arquivo pasta, String nome) {
        try {
            pasta.getArquivo(nome).stream().forEach(t -> t.printNomeDoArquivo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void remover(Arquivo pasta, Arquivo arquivo) {
        try {
            pasta.remover(arquivo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
