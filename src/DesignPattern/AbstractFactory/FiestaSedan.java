package DesignPattern.AbstractFactory;

public class FiestaSedan implements CarroSedan{
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Fiesta Sedan\nFabricante: Ford\nCategoria: Sedan");
    }
}
