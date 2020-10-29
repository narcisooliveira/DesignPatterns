package DesignPattern.FactoryMethod;

public class FabricaChevrolet implements IFabricaDeCarro{

    @Override
    public ICarro criarCarro() {
        return new Celta();
    }
}
