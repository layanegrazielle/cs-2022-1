import java.util.Scanner;

public class Exercicio1{
	public static void main(String[] args) {
	int anos, meses, dias, total;
       Scanner ler = new Scanner(System.in);
        anos = ler.nextInt();
        meses = ler.nextInt();
        dias = ler.nextInt();
        if(anos > -1 && meses < 13 && dias < 31) {
       total = anos * 365 + meses * 30 + dias;
		System.out.println(total);
        }
        else{
            System.out.println("Formatos aceitos:\nAnos >=0\nMeses <= 12\nDias <= 30");
        }
	}
}
