package DesignPattern.AbstractFactory;

public class FabricaFord implements IFabricaDeCarro{

    @Override
    public CarroSedan criarCarroSedan() {
        return new FiestaSedan();
    }

    @Override
    public CarroPopular CriarCarroPopular() {
        return new Fiesta();
    }
}
