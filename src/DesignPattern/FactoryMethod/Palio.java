package DesignPattern.FactoryMethod;

public class Palio implements ICarro {

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Palio\nFabricante: Fiat");
    }
}
