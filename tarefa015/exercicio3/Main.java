public class Main{
    public static void main(String[] args) {
        Usuario user1 = new Usuario("layanegrazielle0#", "Layane0#");
        boolean verificaSenha = Valida.validaSenha(user1);
        boolean verificaLogin = Valida.validaLogin(user1);

        //Login
        if(verificaLogin == true){
            System.out.println("Login " + user1.getLogin() +" e valido ");
        } else{
            System.out.println("Login " + user1.getLogin() +" e invalido ");
        }

        //Senha
        if(verificaSenha == true){ 
           System.out.println("Senha " + user1.getSenha() +" e valido ");
        }else{
        System.out.println("Senha " + user1.getSenha() +" e invalido ");
        }
    }
}