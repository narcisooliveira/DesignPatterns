package DesignPattern.BridgeEstudoDeCaso.Questao01;

public abstract class AbsTamanho {
    protected IRefrigerante refrigerante;

    public AbsTamanho(IRefrigerante refrigerante){
        this.refrigerante = refrigerante;
    }

    public  abstract  void beber();

}
