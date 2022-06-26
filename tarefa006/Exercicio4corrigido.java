import java.util.Scanner;

public class Exercicio4corrigido {
    public static void main(String[] args) {
        double ipi, valor1, valor2, total;
        int quant1, quant2;
        try (Scanner ler = new Scanner(System.in)) {
            ipi = ler.nextDouble();
            valor1 = ler.nextDouble();
            quant1 = ler.nextInt();
            valor2 = ler.nextDouble();
            quant2 = ler.nextInt();
        }
        total = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
            System.out.println(String.format("%.2f", total));

	}
}
