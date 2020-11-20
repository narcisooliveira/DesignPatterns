package DesignPattern.Decorator;

public class DecoratorTeste {
    public static void main(String[] args) {
        Coquetel meuCoquetel = new Cachaca();
        System.out.println(meuCoquetel.getNome()+"="+meuCoquetel.getPreco());

        meuCoquetel = new Refrigerante(meuCoquetel);
        System.out.println(meuCoquetel.getNome()+"="+meuCoquetel.getPreco());
    }
}
