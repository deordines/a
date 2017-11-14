package main.java.br.com.deordines.patterns.comportamental.iterator.exemplo1;

public interface IIterator {

    void first();
    void next();
    boolean isDone();
    Canal currentItem();
}
