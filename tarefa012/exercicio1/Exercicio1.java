package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1{

    private  static Scanner ler = new Scanner(System.in);
    static double num1, num2;
    public static double divide(Double num1, Double num2) {
    
        if(num2 == 0)
           throw new ArithmeticException("O segundo numero deve ser diferente de zero");
              else
            return num1/num2;
        
    }
    
      public static void main(String[] args){
        
   try {
    num1 = ler.nextDouble();
    num2 =  ler.nextDouble();  //num1 = Double.parseDouble(num1);
     
    divide(num1, num2);
   } catch (Exception e) {
    if( e instanceof InputMismatchException){
        throw new InputMismatchException("Valores invalidos " + e);
    }
    else 
        System.out.println(e);
   }

System.out.println("Resultado: "+ String.format("%.2f", divide(num1, num2)));;

}
}