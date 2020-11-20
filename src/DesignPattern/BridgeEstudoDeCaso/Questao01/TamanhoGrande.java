package DesignPattern.BridgeEstudoDeCaso.Questao01;

public class TamanhoGrande extends AbsTamanho{
    public TamanhoGrande(IRefrigerante refrigerante) {
        super(refrigerante);
    }

    @Override
    public void beber() {
        System.out.println("Bebendo "+refrigerante+" Grande");
        System.out.println("Toma copo gole da "+refrigerante);
        System.out.println("Toma copo gole da "+refrigerante);
        System.out.println("Toma copo gole da "+refrigerante);
        System.out.println("Acabou o(a) "+refrigerante);
        System.out.println();
    }
}
