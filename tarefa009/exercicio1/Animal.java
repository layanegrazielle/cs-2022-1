package exercicio1;

public class Animal {

    private String nome;
    private int idade;
    TipoAnimal tipo;
  
    public Animal(String nome, int idade, TipoAnimal tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public String som(){
        return tipo.som(this);
    }

    public String locomove(){
        return tipo.locomove(this);
    }
        public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
        
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void settipo(TipoAnimal tipo2) {
    }    

   
}
