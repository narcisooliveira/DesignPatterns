package DesignPattern.Decorator;

public class CoquetelDecorator extends Coquetel{
    Coquetel coquetel;

    public CoquetelDecorator(Coquetel umCoquetel){
        coquetel = umCoquetel;
    }

    @Override
    public String getNome() {
        return coquetel.getNome()+" + "+nome;
    }

    @Override
    public Double getPreco() {
        return coquetel.getPreco()+preco;
    }
}
