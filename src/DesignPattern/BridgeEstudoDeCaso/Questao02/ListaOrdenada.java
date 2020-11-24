package DesignPattern.BridgeEstudoDeCaso.Questao02;

public class ListaOrdenada extends AbsLista{

    private String[] elementos = new String[10];
    private int tamanho;

    @Override
    public void adicionar(String s) {
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = s;
            this.tamanho++;
        }
    }

    @Override
    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Item-"+i+": "+elementos[i]);
        }
    }
}
