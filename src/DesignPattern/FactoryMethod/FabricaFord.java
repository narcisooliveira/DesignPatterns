package DesignPattern.FactoryMethod;

public class FabricaFord implements IFabricaDeCarro{

    @Override
    public ICarro criarCarro() {
        return new Fiesta();
    }
}
