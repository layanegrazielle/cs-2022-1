package exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    private  static Scanner ler = new Scanner(System.in);

    public static void main (String[] args){
        int vetor[]= new int [10];
        int i = 0;
        try{
            while(true){
                vetor[i] = ler.nextInt();
                i++;
            }
        }catch(Exception e){
                if( e instanceof InputMismatchException){
                    throw new InputMismatchException("Valores invalidos " + e);
                }
                else 
                    System.out.println("Array cheio " + e);
               }
        
    }

}
