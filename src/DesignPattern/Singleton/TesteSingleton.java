package DesignPattern.Singleton;

public class TesteSingleton {
    public static void main(String[] args) {
        FabricaDeCarro fabricaDeCarro = FabricaDeCarro.getInstancia();

        System.out.println(fabricaDeCarro.criarCarrosFiat());
        System.out.println(fabricaDeCarro.criarCarrosFord());
        System.out.println(fabricaDeCarro.criarCarrosVolks());

        System.out.println(fabricaDeCarro.gerarRelatorio());
    }
}
