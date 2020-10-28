package br.edu.ifs.ED_20201.fila;

public interface IFila<T> {
    void incluir(T t) throws FilaCheiaException;
    T remover() throws FilaVaziaException;
    int getQtd();
    int getQtdMaxSuportada();
    boolean estaVazia();
    void limpar();
    T visualizarProximo() throws  FilaVaziaException;
}
