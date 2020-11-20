package DesignPattern.Bridge;

public abstract class  JanelaAbs {
    protected JanelaImplementada janela;

    public  JanelaAbs(JanelaImplementada j){
        janela = j;
    }

    public void desenharjanela(String titulo){
        janela.desenharJanela(titulo);
    }

    public void desenharBotao(String titulo){
        janela.desenharBotao(titulo);
    }

    public abstract void desenhar();
}
