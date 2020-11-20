package DesignPattern.BridgeEstudoDeCaso.Questao01;

public class TamanhoFamilia extends AbsTamanho{
    public TamanhoFamilia(IRefrigerante refrigerante) {
        super(refrigerante);
    }

    @Override
    public void beber() {
        System.out.println("Bebendo "+refrigerante+" Tamanho Familia");
        System.out.println("Toma um copo da "+refrigerante);
        System.out.println("Toma um copo da "+refrigerante);
        System.out.println("Toma um copo da "+refrigerante);
        System.out.println("Toma um copo da "+refrigerante);
        System.out.println("Acabou o(a) "+refrigerante);
        System.out.println();
    }
}
