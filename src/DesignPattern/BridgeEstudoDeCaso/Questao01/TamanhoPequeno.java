package DesignPattern.BridgeEstudoDeCaso.Questao01;

public class TamanhoPequeno extends AbsTamanho{

    public TamanhoPequeno(IRefrigerante refrigerante) {
        super(refrigerante);
    }

    @Override
    public void beber() {
        System.out.println("Bebendo "+refrigerante+" Pequeno");
        System.out.println("Toma um copo da "+refrigerante);
        System.out.println("Acabou o(a) "+refrigerante);
        System.out.println();
    }
}
