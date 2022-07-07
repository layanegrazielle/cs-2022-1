import java.util.Random;
public class Mergesort {
  public static void main(String[] args){
    Random random = new Random();
//100
long tempoInicial = System.currentTimeMillis();
    int [] numeros1 = new int [100];
    for(int i = 0; i < 100; i++){
        numeros1[i] = random.nextInt(100);
 }  
  MergeSort(numeros1.length, numeros1);
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
   MergeSort(numeros2.length, numeros2);
   System.out.println("\nTamanho 1000\n");
   for(int i = 0; i < 1000; i++){
     System.out.print(numeros2[i] + ", ");
      }

      long tempoFinal2 = System.currentTimeMillis();  
      System.out.printf("\nTempo: %.3f ms%n", (tempoFinal2 - tempoInicial2) / 1000d);  
//1000
long tempoInicial3 = System.currentTimeMillis();
      int [] numeros3 = new int [10000];
     for(int i = 0; i < 10000; i++){
    numeros3[i] = random.nextInt(10000);
     }
   MergeSort(numeros3.length, numeros3);
   System.out.println("\nTamanho 10000\n");
   for(int i = 0; i < 10000; i++){
     System.out.print(numeros3[i] + ", ");
      }
      long tempoFinal3 = System.currentTimeMillis();  
      System.out.printf("\nTempo: %.3f ms%n", (tempoFinal3 - tempoInicial3) / 1000d);  
  }

public static void MergeSort(int tamanho, int[] vetor) {

  int elementos = 1;
  int inicio, meio, fim;
  while(elementos < tamanho) {
    inicio = 0;

   while(inicio + elementos < tamanho) {
        meio = inicio + elementos;
        fim = inicio + 2 * elementos;

        if(fim > tamanho)
            fim = tamanho;

  intercala(vetor, inicio, meio, fim);
  while(elementos < tamanho) {

      inicio = 0;

      while(inicio + elementos < tamanho) {

          meio = inicio + elementos;
  
          fim = inicio + 2 * elementos;

          if(fim > tamanho)
              fim = tamanho;

          intercala(vetor, inicio, meio, fim);
          inicio = fim;
      }
      elementos = elementos * 2;
  }
}
}
}
  private static void intercala(int[] vetor, int inicio, int meio, int fim) {

    int novoVetor[] = new int[fim - inicio];
    int i = inicio;
    int m = meio;
    int pos = 0;

    while(i < meio && m < fim) {

        if(vetor[i] <= vetor[m]) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        } else {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }
    }

    while(i < meio) {
        novoVetor[pos] = vetor[i];
        pos = pos + 1;
        i = i + 1;
    }

    while(m < fim) {
        novoVetor[pos] = vetor[m];
        pos = pos + 1;
        m = m + 1;
    }
    for(pos = 0, i = inicio; i < fim; i++, pos++) {
        vetor[i] = novoVetor[pos];
    }
}
}

