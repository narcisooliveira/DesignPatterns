package DesignPattern.AbstractFactory;

public class Palio implements CarroPopular{
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio\nFabricante: Fiat\nCategoria: Popular Hatch");
    }
}
