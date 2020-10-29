package DesignPattern.AbstractFactory;

public class TesteAbstractFactory {
    public static void main(String[] args) {
        // Instanciando onjetos ou produtos (carros) de cada tipo
        Palio carro1 = new Palio();
        Siena carro2 = new Siena();
        Fiesta carro3 = new Fiesta();
        FiestaSedan carro4 = new FiestaSedan();

        // Verificando Informações
        carro1.exibirInfoPopular();
        System.out.println();
        carro2.exibirInfoSedan();
        System.out.println();
        carro3.exibirInfoPopular();
        System.out.println();
        carro4.exibirInfoSedan();
    }
}
