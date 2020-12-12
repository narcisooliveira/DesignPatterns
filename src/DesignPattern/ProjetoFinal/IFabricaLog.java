package DesignPattern.ProjetoFinal;

import java.io.IOException;

public interface IFabricaLog {
    void criarLog(String s) throws InvalidElementException, IOException;
}
