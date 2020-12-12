package DesignPattern.ProjetoFinal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FabricaLog implements IFabricaLog{


    @Override
    public void criarLog(String s) throws InvalidElementException, IOException {

        if (s.equals("console")) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }else if (s.equals("arquivo")) {
            FileWriter arq = new FileWriter("d:\\resultado.txt");
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.printf("+--Resultado--+%n");
            for (int i=1; i<=10; i++) {
                gravarArq.printf(String.valueOf(i));
            }
            arq.close();
        }else throw new InvalidElementException("Elemento Inválido!");
    }

}
