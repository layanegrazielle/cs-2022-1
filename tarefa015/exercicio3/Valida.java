public class Valida {
    public static boolean validaLogin(Usuario usuario){

        String login = usuario.getLogin();

        return login.matches(".{5,30}");

    }

    public static boolean validaSenha(Usuario usuario){

        String senha = usuario.getSenha();

        return senha.matches("(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$&%¨*_]).{8,12}");
    }
}
