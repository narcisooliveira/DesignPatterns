package diversos.questao_3.ordenacao;

public class merge_sort extends abs_sort{

        // ordenando de forma crescente merge (x,0,9)
        /* mostrando o vetor ordenado
        for (int j = 0; j <= 9; j++) {
            System.out.println((j+1)+" número: "+x[j]);
        } */

    public static void merge(int x[], int inicio, int fim){
        int meio;
        if (inicio > fim){
            meio = (inicio + fim)/2;
            merge(x, inicio, fim);
            merge(x, meio+1, fim);

        }
    }

    public static void intercala(int x[], int inicio, int fim, int meio){
        int poslivre, inicio_vetor1, inicio_vetor2, i;
        int aux[] = new int[10];
        inicio_vetor1 = inicio;
        inicio_vetor2 = meio + 1;
        poslivre = inicio;

        while (inicio_vetor1 <= meio && inicio_vetor2 <= fim){
            if (x[inicio_vetor1] <= x[inicio_vetor2]){
                aux[poslivre] = x[inicio_vetor1];
                inicio_vetor1 = inicio_vetor1 + 1;
            }else {
                aux[poslivre] = x[inicio_vetor2];
                inicio_vetor2 = inicio_vetor2 + 1;
            }
            poslivre = poslivre + 1;
        }
        // se ainda existem números no primeiro vetor
        // que não foram intercalados
        for (i = inicio_vetor1;i <= meio; i++) {
            aux[poslivre] = x[i];
            poslivre = poslivre + 1;
        }
        // se ainda existem números no segundo vetor
        // que não foram intercalados
        for (int j = inicio_vetor2; j <= fim; j++) {
            aux[poslivre] = x[j];
            poslivre = poslivre + 1;
        }
        // retorna os valores do vetor aux para o vetor x
        for (int j = inicio; j <= fim; j++) {
            x[j] = aux[j];
        }
    }

    @Override
    public void ordenar(int[] valores) {

    }
}
