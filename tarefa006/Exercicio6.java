import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int num;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
       	System.out.println("Antecessor: " + (num -1));
        System.out.println("Sucessor: " + (num +1));
    }
}
