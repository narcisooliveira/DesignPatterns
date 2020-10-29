package diversos.questao_3.ordenacao;

import java.util.Scanner;

public abstract class abs_sort implements IOrdenacao{
        int[] x = new int[10];
        Scanner entrada = new Scanner(System.in);
        // carregando os números no vetor
        public int[] preencher(){
            for (int j = 0; j <= 9; j++) {
              System.out.println("Digite " + (j + 1) + "º número: ");
              x[j] = entrada.nextInt();
             }
            return x;
        }
}
