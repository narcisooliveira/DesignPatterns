package br.edu.ifs.ED_20201.fila;

public class TesteFila {
    public static void main(String[] args) throws FilaCheiaException, FilaVaziaException {

        Fila<Integer> fila = new Fila<>();

        fila.incluir(1);
        fila.incluir(2);
        fila.incluir(3);

        System.out.println(fila);

        System.out.println(fila.remover());

        System.out.println(fila);

        System.out.println(fila.remover());

        System.out.println(fila);

        System.out.println(fila.remover());

        System.out.println(fila);

    }
}
