package exercicio3;

import java.util.Scanner;

public class Main {
    private  static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        Login login1 = new Login("layane", "123");
        try{
            String usuario = ler.nextLine();
            String senha = ler.nextLine();

           System.out.println(login1.fazerlogin(usuario,senha)); 
        } catch (Exception e){
            System.out.println("Não autorizado" + e);
        }
       
    }
}
