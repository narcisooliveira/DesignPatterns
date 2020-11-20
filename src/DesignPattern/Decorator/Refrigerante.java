package DesignPattern.Decorator;

public class Refrigerante extends CoquetelDecorator{
    public Refrigerante(Coquetel umCoquetel) {
        super(umCoquetel);
        nome = "Refri";
        preco = 1.0;
    }
}
