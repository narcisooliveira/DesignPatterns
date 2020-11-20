package DesignPattern.Bridge;

public class BridgeTeste {
    public static void main(String[] args) {
        JanelaAbs janela01 = new JanelaDialogo(new JanelaLinux());
        janela01.desenhar();
        janela01 = new JanelaAviso(new JanelaLinux());
        janela01.desenhar();
        System.out.println();
        janela01 = new JanelaDialogo(new JanelaWindows());
        janela01.desenhar();
    }
}
