package DesignPattern.Bridge;

public class JanelaAviso extends JanelaAbs {
    public JanelaAviso(JanelaImplementada j){
        super(j);
    }


    @Override
    public void desenhar() {
        desenharjanela("Janela de Aviso");
        desenharBotao("Ok");
    }
}
