package DesignPattern.Builder;

public class VolksBuilder extends CarroBuilder{

    @Override
    public void buildPreco() {
        carro.preco = 30000;
    }

    @Override
    public void buildDscMotor() {
        carro.dscMotor = "Trend 1.0";
    }

    @Override
    public void buildAnoDeFabricacao() {
        carro.anoDeFabricacao = 2013;
    }

    @Override
    public void buildModelo() {
        carro.modelo = "Gol";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "Volkswagem";
    }
}
