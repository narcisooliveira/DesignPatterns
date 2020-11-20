package DesignPattern.BridgeEstudoDeCaso.Questao01;

public class Teste {
    public static void main(String[] args) {
        AbsTamanho refri01 = new TamanhoFamilia(new Guarana());
        refri01.beber();
        System.out.println();
        refri01 = new TamanhoMedio(new CocaCola());
        refri01.beber();
    }
}
