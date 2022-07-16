/**
 * @class define bairro
 * @author layanegrazielle
 * @date 15 de julho de 2022
 */

public class Bairro{
    
       private String nome;
       private Cidade cidade;
       /**
        * Cria um bairro
        * @param nome
        * @param cidade
        */
    public Bairro(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }
    
    /** 
     * @return String
     */
    public String getNome() {
        return nome;
    }
    
    /** 
     * @return Cidade
     */
    public Cidade getCidade() {
        return cidade;
    }
    
    /** 
     * @param cidade
     */
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    /** 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}