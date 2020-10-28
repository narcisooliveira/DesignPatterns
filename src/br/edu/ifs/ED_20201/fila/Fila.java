package br.edu.ifs.ED_20201.fila;

public class Fila<T> extends EstruturaEstatica<T> implements IFila<T>{

    @Override
    public void incluir(T valor) throws FilaCheiaException {
        if (!this.adiciona(valor)){
            throw new FilaCheiaException("Fila Cheia!");
        }

    }

    @Override
    public T remover() throws FilaVaziaException {
        final int posicao = 0;
        T elementoRemovido = this.elementos[posicao];
        if (this.estaVazia()) {
            throw new FilaVaziaException("Fila Vazia!");
        }
        this.remove(posicao);
        return elementoRemovido;
    }

    @Override
    public int getQtd() {
        return this.tamanho-1;
    }

    @Override
    public int getQtdMaxSuportada() {
        return this.tamanho();
    }

    @Override
    public void limpar() {
        int pos = 0;
        this.remove(pos);
    }

    @Override
    public T visualizarProximo() throws FilaVaziaException {
        if (this.estaVazia()) {
            throw new FilaVaziaException("Fila Vazia!");
        }return this.elementos[0];
    }
}
