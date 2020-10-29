package DesignPattern.FactoryMethod;

public class FabricaVolks implements IFabricaDeCarro{

    @Override
    public ICarro criarCarro() {
        return new Gol();
    }
}
