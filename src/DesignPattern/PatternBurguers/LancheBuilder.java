package DesignPattern.PatternBurguers;

public abstract class LancheBuilder {

    protected LancheProduct lanche;

    public LancheBuilder(){
        lanche = new LancheProduct();
    }

    public abstract void precoSanduba();
    public abstract void tipoSanduba();
    public abstract void salada();
    public abstract void tamanhoBatata();
    public abstract void refri();
    public abstract void brinquedo();
    public LancheProduct getLanche(){
        return lanche;
    }
}
