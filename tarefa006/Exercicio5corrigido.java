import java.util.Scanner;

public class Exercicio5corrigido {
    public static void main(String[] args) {
        double salMin, salario, quant;
        try (Scanner ler = new Scanner(System.in)) {
            salMin = ler.nextDouble();
            salario = ler.nextDouble();
        }
        quant = salario / salMin;
       	System.out.println(String.format("%.1f", quant));

	}
}
