package DesignPattern.AbstractFactory;

public class TesteAbstractFactory {
    public static void main(String[] args) {
        // Instanciando onjetos ou produtos (carros) de cada tipo
        Palio carro1 = new Palio();
        Siena carro2 = new Siena();

        // Verificando Informações
        carro1.exibirInfoPopular();
        System.out.println();
        carro2.exibirInfoSedan();
    }
}
