import java.util.Random;

public class MergeSorRecursivo {
    public static void main(String[] args){
        Random random = new Random();
    
//100
long tempoInicial = System.currentTimeMillis();
    int [] numeros1 = new int [100];
    for(int i = 0; i < 100; i++){
        numeros1[i] = random.nextInt(100);
 }  
  mergeSort(100, numeros1);
  System.out.println("\nTamanho 100\n");
  

  for(int i = 0; i < 100; i++){
    System.out.print(numeros1[i] + ", ");
     } 
  long tempoFinal = System.currentTimeMillis();  
  System.out.printf("\nTempo: %.3f ms%n", (tempoFinal - tempoInicial) / 1000d);  
//1000
long tempoInicial2 = System.currentTimeMillis();
     int [] numeros2 = new int [1000];
     for(int i = 0; i < 1000; i++){
    numeros2[i] = random.nextInt(1000);
     }
   mergeSort(1000, numeros2);
   System.out.println("\nTamanho 1000\n");
   for(int i = 0; i < 1000; i++){
     System.out.print(numeros2[i] + ", ");
      }

      long tempoFinal2 = System.currentTimeMillis();  
      System.out.printf("\nTempo: %.3f ms%n", (tempoFinal2 - tempoInicial2) / 1000d);  
//10000
long tempoInicial3 = System.currentTimeMillis();
      int [] numeros3 = new int [10000];
     for(int i = 0; i < 10000; i++){
    numeros3[i] = random.nextInt(10000);
     }
   mergeSort(10000, numeros3);
   System.out.println("\nTamanho 10000\n");
   for(int i = 0; i < 10000; i++){
     System.out.print(numeros3[i] + ", ");
      }
      long tempoFinal3 = System.currentTimeMillis();  
      System.out.printf("\nTempo: %.3f ms%n", (tempoFinal3 - tempoInicial3) / 1000d);  
     }
        

    public static void mergeSort(int tamanho, int[] vetor) {

        
       int metade = tamanho/2;
      
        int esquerda [] = new int[metade];
        int direita [] = new int [metade];
      
        for(int i = 0 ; i < metade; i++){
            esquerda[i] = vetor [i];
        }
        for(int j = metade; j < tamanho; j++){
            direita[j - metade] = vetor[j];
        }
      
        mergeSort(metade, esquerda);
        mergeSort(metade, direita);
        merge(vetor, esquerda, direita, metade, metade);
    }
    public static void merge(int[] vetor, int[] esquerda, int[] direita, int ladoesq, int ladodir) {
 
        int i = 0, j = 0, k = 0;
        while (i < ladoesq && j < ladodir) {
            if (esquerda[i] <= direita[j]) {
                vetor[k++] = esquerda[i++];
            }
            else {
                vetor[k++] = direita[j++];
            }
        }
        while (i < ladoesq) {
            vetor[k++] = esquerda[i++];
        }
        while (j < ladodir) {
            vetor[k++] = direita[j++];
        }
      }
    }    

