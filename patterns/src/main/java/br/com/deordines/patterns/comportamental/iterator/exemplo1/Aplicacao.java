package main.java.br.com.deordines.patterns.comportamental.iterator.exemplo1;

/**
 * DESIGN PATTERN - ITERATOR
 *
 * CONCEITO:
 * Fornecer um meio de acessar sequencialmente os elementos de uma coleção sem expor sua representação interna.
 *
 * VANTAGENS:
 * Fácil usabilidade;
 * Desacoplamento dos tipos de coleções;
 * Uso da interface para percorrer diferentes coleções (iteração polimórfica).
 *
 * DESVANTAGENS:
 * ###
 *
 */
public class Aplicacao {

    public static void main(String[] args) {

        Canais canaisEsporte = new CanaisEsporte();
        Canais canaisCulinaria = new CanaisCulinaria();

        System.out.println("\nIterando Canais de Esportes\n");
        iterar(canaisEsporte);

        System.out.println("\nIterando Canais de Culinária\n");
        iterar(canaisCulinaria);
    }

    private static void iterar(Canais canais) {
        IIterator iterator = canais.criarIterator();
        while (iterator.hasNext()) {
            Canal canal = iterator.next();
            System.out.println("- " + canal.getNome());
        }
    }
}
