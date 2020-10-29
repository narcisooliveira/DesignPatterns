package DesignPattern.FactoryMethod;

public class TesteFactoryMethod {
    public static void main(String[] args) {

        Celta carro1 = new Celta();
        Gol carro2 = new Gol();
        Fiesta carro3 = new Fiesta();
        Palio carro4 = new Palio();

        carro1.exibirInfo();
        System.out.println();
        carro2.exibirInfo();
        System.out.println();
        carro3.exibirInfo();
        System.out.println();
        carro4.exibirInfo();
    }
}
