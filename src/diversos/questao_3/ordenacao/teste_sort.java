package diversos.questao_3.ordenacao;

public class teste_sort {
    public static void main(String[] args) {
        selection_sort selection_sort = new selection_sort();
        int[] x;
        x = selection_sort.preencher();
        selection_sort.ordenar(x);
    }
}
