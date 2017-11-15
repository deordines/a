package main.java.br.com.deordines.patterns.criacao.objectpool.exemplo1;

import java.sql.Connection;
import java.sql.DriverManager;

public class H2ConnectionPool extends ObjectPool<Connection>{

    private String url, usuario, senha;

    public H2ConnectionPool(String driver, String url, String usuario, String senha) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    protected Connection criar() {
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected boolean validar(Connection conexao) {
        try {
            return !conexao.isClosed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    protected void expirar(Connection conexao) {
        try {
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
