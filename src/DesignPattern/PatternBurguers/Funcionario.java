package DesignPattern.PatternBurguers;

public class Funcionario {
    protected LancheBuilder montarLanche;

    public Funcionario(LancheBuilder montarSanduba){
        this.montarLanche = montarSanduba;
    }

    public void montarLanche(){
        montarLanche.tipoSanduba();
        montarLanche.tamanhoBatata();
        montarLanche.refri();
        montarLanche.precoSanduba();
        montarLanche.salada();
        montarLanche.brinquedo();
    }

    public LancheProduct getLanche() {
        return montarLanche.getLanche();
    }

}
