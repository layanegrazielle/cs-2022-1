/**
 * @class define logradouro
 * @author layanegrazielle
 * @date 15 de julho de 2022
 */

public class  Logradouro{
    private String nome;
    private TipoLogradouro tipoLogradouro;
/**
 * Cria logradouro
 * @param nome
 * @param tipoLogradouro
 */
    public Logradouro(String nome, TipoLogradouro tipoLogradouro) {
        this.setNome(nome);
        this.setTipoLogradouro(tipoLogradouro);
    }

    
    /** 
     * @return TipoLogradouro
     */
    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    
    /** 
     * @param tipoLogradouro
     */
    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    
    /** 
     * @return String
     */
    public String getNome() {
        return nome;
    }

    
    /** 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}