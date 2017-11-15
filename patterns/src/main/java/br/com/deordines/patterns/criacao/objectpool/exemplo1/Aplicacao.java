package main.java.br.com.deordines.patterns.criacao.objectpool.exemplo1;

import java.sql.Connection;

/**
 * DESIGN PATTERN - OBJECT POOL
 *
 * CONCEITO:
 * Oferecer um meio de reutilizar as classes instanciadas, evitando a criação de novas instâncias.
 *
 * VANTAGENS:
 * Aumento significativo de desempenho;
 * Evitar a criação de novas instâncias quando o custo de inicialização, instanciação ou destruição for alto.
 *
 * DESVANTAGENS:
 * Dado o custo dos recursos utilizados, é preferível que o número de instâncias a serem reutilizadas seja baixo.
 *
 * Obs.: este exemplo necessita da dependência da lib H2 Database Engine.
 */
public class Aplicacao {

    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_CONEXAO = "jdbc:h2:~/test";
    private static final String DB_USUARIO = "";
    private static final String DB_SENHA = "";

    public static void main(String[] args) {
        H2ConnectionPool pool = new H2ConnectionPool(DB_DRIVER, DB_CONEXAO, DB_USUARIO, DB_SENHA);

        Connection conexao = pool.obterConexao();
        pool.suspender(conexao);
        conexao = pool.obterConexao();

        pool.suspender(conexao);
        pool.expirar(conexao);
        conexao = pool.obterConexao();
    }
}
