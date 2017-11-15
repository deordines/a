package main.java.br.com.deordines.patterns.criacao.objectpool.exemplo1;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {

    protected Long tempoExpiracaoMillisegundos;
    protected Hashtable<T, Long> conexaoEmUso, conexaoEmEspera;

    protected ObjectPool() {
        tempoExpiracaoMillisegundos = 10000l;
        conexaoEmUso = new Hashtable<T, Long>();
        conexaoEmEspera = new Hashtable<T, Long>();
    }

    protected abstract T criar();

    protected abstract boolean validar(T conexao);

    protected abstract void expirar(T conexao);

    protected synchronized T obterConexao() {
        Long tempoAtual = System.currentTimeMillis();
        T conexao;

        if (conexaoEmEspera.size() > 0) {
            Enumeration<T> e = conexaoEmEspera.keys();
            while (e.hasMoreElements()) {
                conexao = e.nextElement();
                if ((tempoAtual - conexaoEmEspera.get(conexao)) > tempoExpiracaoMillisegundos) {
                    conexaoEmEspera.remove(conexao);
                    expirar(conexao);
                    conexao = null;
                } else {
                    if (validar(conexao)) {
                        conexaoEmEspera.remove(conexao);
                        conexaoEmUso.put(conexao, tempoAtual);
                        return conexao;
                    } else {
                        conexaoEmEspera.remove(conexao);
                        expirar(conexao);
                        conexao = null;
                    }
                }
            }
        }
        conexao = criar();
        conexaoEmUso.put(conexao, tempoAtual);
        return conexao;
    }

    protected synchronized void suspender(T conexao) {
        conexaoEmUso.remove(conexao);
        conexaoEmEspera.put(conexao, System.currentTimeMillis());
    }
}
