package DesignPattern.FactoryMethod;

public class FabricaFiat implements IFabricaDeCarro{

    @Override
    public ICarro criarCarro() {
        return new Palio();
    }
}
