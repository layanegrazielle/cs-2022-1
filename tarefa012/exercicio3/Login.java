package exercicio3;

public class Login {
    private String usuario, senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    public boolean fazerlogin(String usuario, String senha) throws Excessao{
        if (usuario.equals(this.usuario) && senha.equals(this.senha))
        return true;

        throw new Excessao("Usuario ou senha invalido");
        }
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
