package DesignPattern.BridgeEstudoDeCaso.Questao01;

public class TamanhoMedio extends  AbsTamanho{

    public TamanhoMedio(IRefrigerante refrigerante) {
        super(refrigerante);

    }

    @Override
    public void beber() {
        System.out.println("Bebendo "+refrigerante+" Médio");
        System.out.println("Toma um copo da "+refrigerante);
        System.out.println("Toma um copo da "+refrigerante);
        System.out.println("Acabou o(a) "+refrigerante);
        System.out.println();
    }
}
