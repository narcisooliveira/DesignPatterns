package DesignPattern.PatternBurguers;

public class Atendente extends LancheBuilder {

    @Override
    public void precoSanduba() {
        lanche.precoLanche = 20;
    }

    @Override
    public void tipoSanduba() {
        lanche.tipoLanche = "CheeseBurguer";
    }

    @Override
    public void salada() {
        lanche.salada = true;
    }

    @Override
    public void tamanhoBatata() {
        lanche.tamanhoBatata = "Média";
    }

    @Override
    public void refri() {
        lanche.refri = "Coca";
    }

    @Override
    public void brinquedo() {
        lanche.brinquedo = "Carrinho";
    }
}
