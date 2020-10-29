package DesignPattern.AbstractFactory;

public class Siena implements CarroSedan{
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Siena\nFabricante: Fiat\nCategoria: Sedan");
    }
}
