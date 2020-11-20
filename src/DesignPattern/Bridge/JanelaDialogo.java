package DesignPattern.Bridge;

public class JanelaDialogo extends  JanelaAbs{
    public JanelaDialogo(JanelaImplementada j){
        super(j);
    }

    @Override
    public void desenhar() {
        desenharjanela("Janela de Diálogo");
        desenharBotao("Botão Sim");
        desenharBotao("Botão Não");
        desenharBotao("Botão Cancelar");
    }
}
