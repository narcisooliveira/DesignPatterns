package DesignPattern.PatternBurguers;

public class TestePatternBurguers {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(new Atendente());

        funcionario.montarLanche();
        LancheProduct lanche = funcionario.getLanche();

        System.out.println("Lanche: "+lanche.tipoLanche+"\nBatata tamanho: "+lanche.tamanhoBatata+
                "\nRefrigerante: "+lanche.refri+"\nBrinquedo: "+lanche.brinquedo+
                "\nTotal: "+lanche.precoLanche);
        System.out.println();
        Pedido pedido = new Pedido();
        pedido.adicionarDentroDaCaixa("Sanduíche, batata e brinquedo");
        pedido.adicionarForaDaCaixa("Refrigerante");
        System.out.println(pedido.toString());
    }
}
