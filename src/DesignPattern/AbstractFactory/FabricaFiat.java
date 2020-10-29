package DesignPattern.AbstractFactory;

public class FabricaFiat implements IFabricaDeCarro{
    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroPopular CriarCarroPopular() {
        return new Palio();
    }
}
