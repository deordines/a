package main.java.br.com.deordines.patterns.estrutural.composite.exemplo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArquivoComposto extends Arquivo {

    List<Arquivo> arquivos = new ArrayList<>();

    protected ArquivoComposto(String nomeDoArquivo) {
        super(nomeDoArquivo);
    }

    @Override
    protected String getNomeDoArquivo() {
        return super.getNomeDoArquivo();
    }

    @Override
    protected void printNomeDoArquivo() {
        System.out.println(this.getNomeDoArquivo());
        arquivos.stream()
                .forEach(arquivo -> arquivo.printNomeDoArquivo());
    }

    @Override
    protected void adicionar(Arquivo arquivo) throws Exception {
        this.arquivos.add(arquivo);
        System.out.println(String.format("[%s] adicionado com sucesso.", arquivo.getNomeDoArquivo()));
    }

    @Override
    protected void adicionar(List<Arquivo> arquivos) throws Exception {
        this.arquivos.addAll(arquivos);
        arquivos.stream().forEach(a -> System.out.println(String.format("[%s] adicionado com sucesso.", a.getNomeDoArquivo())));
    }

    @Override
    protected void remover(Arquivo arquivo) throws Exception {
        arquivos.removeIf(a -> a.equals(arquivo));
        System.out.println(String.format("[%s] removido com sucesso.", arquivo.getNomeDoArquivo()));
    }

    @Override
    protected List<Arquivo> getArquivo(String nomeDoArquivo) throws Exception {
        List<Arquivo> tmp = arquivos.stream()
                .filter(a -> a.getNomeDoArquivo().contains(nomeDoArquivo))
                .collect(Collectors.toList());

        if (!tmp.isEmpty()) return tmp;
        else throw new Exception("Nenhum arquivo encontrado.");

    }
}
