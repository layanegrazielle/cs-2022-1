import java.util.Scanner;

public class Exercicio3corrigido {
    public static void main(String[] args) {
        double saldo;
        try (Scanner ler = new Scanner(System.in)) {
            saldo = ler.nextDouble();
        }
        System.out.println(saldo + (saldo * 0.15));

	}
}
