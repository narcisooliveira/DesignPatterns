package DesignPattern.Facade;

public class MaquinaDeLavarRoupa {
    public void LavarRoupaMuitoSuja(){
        setTemperaturaAgua(100);
        setDuracaoCicloLavagem(90);
        setDuracaoCicloRotagem(10);
        addDetergente();
        addAlvejante();
        addAmaciante();
        aquecerAgua();
        iniciarLavagem(true);
    }
    public void lavaRoupaPoucoSuja(){

    }
}
