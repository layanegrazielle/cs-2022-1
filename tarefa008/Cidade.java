/**
 * @class define cidade
 * @author layanegrazielle
 * @date 15 de julho de 2022
 */

public class Cidade{
    private String nome;
    private Estado estado;
   
    
    /** 
     * @return String
     */
    public String getNome() {
        return nome;
    }
    
    /** 
     * @return Estado
     */
    public Estado getEstado() {
        return estado;
    }
    
    /** 
     * @param estado
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    /** 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}

