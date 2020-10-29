package diversos.questao_3.ordenacao;

public class selection_sort extends abs_sort{
            public selection_sort(){
                super();
            }

            @Override
            public void ordenar (int[] x){
                int eleito, menor, pos;
                // ordenando de forma crescente
                // laço que percorre da 1ª posição à penúltima
                // elegendo um número para ser comparado
                for (int k = 0; k <= 8; k++) {
                    eleito = x[k];
                    // encontrando o menor número à direita do eleito
                    // com sua respectiva posição
                    // primeiro número à direita do eleito
                    // na posição = k + 1
                    menor = x[k+1];
                    pos = k+1;
                    // laço que percorre os elementos
                    // que estão à direita do
                    // número eleito, retornando o menor número à
                    // direita e sua posição
                    for (int l = 0; l <= 4; l++) {
                        if (x[l] < menor){
                            menor = x[l];
                            pos = l;
                        }
                    }
                    // troca do número eleito com o número da posição pos
                    // o número da posição pos é o menor número à direita
                    // do número eleito
                    if (menor < eleito){
                        x[k] = x[pos];
                    }
                }
                // mostrando o vetor ordenado
                for (int k = 0; k <= 9; k++) {
                    System.out.println((k + 1) + " número: " + x[k]);
                }
            }
        }
