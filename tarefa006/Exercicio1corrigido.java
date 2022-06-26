import java.util.Scanner;

public class Exercicio1corrigido{
	public static void main(String[] args) {
	int anos, meses, dias, total;
       try (Scanner ler = new Scanner(System.in)) {
        anos = ler.nextInt();
        meses = ler.nextInt();
        dias = ler.nextInt();
    }
       total = anos * 365 + meses * 30 + dias;
		System.out.println(total);
	}
}
