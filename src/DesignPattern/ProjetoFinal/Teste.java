package DesignPattern.ProjetoFinal;

import java.io.IOException;

public class Teste {
    public static void main(String[] args) throws IOException, InvalidElementException {
        FabricaLog fabricaLog = new FabricaLog();

        fabricaLog.criarLog("console");
    }
}
