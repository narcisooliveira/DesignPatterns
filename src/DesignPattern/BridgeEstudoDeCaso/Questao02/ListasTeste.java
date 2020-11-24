package DesignPattern.BridgeEstudoDeCaso.Questao02;

public class ListasTeste {
    public static void main(String[] args) {
        AbsLista lista = new ListaOrdenada();
        lista.adicionar("1");
        lista.adicionar("2");
        lista.adicionar("3");
        lista.adicionar("a");
        lista.adicionar("b");

        lista.imprimir();

        lista = new ListaNaoOrdenada();
        lista.adicionar("1");
        lista.adicionar("2");
        lista.adicionar("3");
        lista.adicionar("a");
        lista.adicionar("b");
        System.out.println();

        lista.imprimir();
    }
}
