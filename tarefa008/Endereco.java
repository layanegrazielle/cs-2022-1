/**
 * @class define endereco
 * @author layanegrazielle
 * @date 15 de julho de 2022
 */

public class Endereco{
    
    private TipoEndereco tipoEndereco;
    private Integer numero;
    private String complemento;
    private Integer cep; 
    private Logradouro logradouro;
    private Bairro bairro;
/**
 * Cria um endereco
 * @param tipoEndereco
 * @param numero
 * @param complemento
 * @param cep
 * @param logradouro
 * @param bairro
 */
  public Endereco(TipoEndereco tipoEndereco, Integer numero, String complemento, Integer cep, Logradouro logradouro,
          Bairro bairro) {
      this.setTipoEndereco(tipoEndereco);
      this.setNumero(numero);
      this.setComplemento(complemento);
      this.setCep(cep);
      this.setLogradouro(logradouro);
      this.setBairro(bairro);
  }

  
  /** 
   * @return Bairro
   */
  public Bairro getBairro() {
      return bairro;
  }

  
  /** 
   * @param bairro
   */
  public void setBairro(Bairro bairro) {
      this.bairro = bairro;
  }

  
  /** 
   * @return Logradouro
   */
  public Logradouro getLogradouro() {
      return logradouro;
  }

  
  /** 
   * @param logradouro
   */
  public void setLogradouro(Logradouro logradouro) {
      this.logradouro = logradouro;
  }

  
  /** 
   * @return Integer
   */
  public Integer getCep() {
      return cep;
  }

  
  /** 
   * @param cep
   */
  public void setCep(Integer cep) {
      this.cep = cep;
  }

  
  /** 
   * @return String
   */
  public String getComplemento() {
      return complemento;
  }

  
  /** 
   * @param complemento
   */
  public void setComplemento(String complemento) {
      this.complemento = complemento;
  }

  
  /** 
   * @return Integer
   */
  public Integer getNumero() {
      return numero;
  }

  
  /** 
   * @param numero
   */
  public void setNumero(Integer numero) {
      this.numero = numero;
  }

  
  /** 
   * @return TipoEndereco
   */
  public TipoEndereco getTipoEndereco() {
      return tipoEndereco;
  }

  
  /** 
   * @param tipoEndereco
   */
  public void setTipoEndereco(TipoEndereco tipoEndereco) {
      this.tipoEndereco = tipoEndereco;
  } 
  

}