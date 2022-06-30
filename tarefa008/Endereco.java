public class Endereco{
    
      private TipoEndereco tipoEndereco;
      private Integer numero;
      private String complemento;
      private Integer cep; 
      private Logradouro logradouro;
      private Bairro bairro;

    public Endereco(TipoEndereco tipoEndereco, Integer numero, String complemento, Integer cep, Logradouro logradouro,
            Bairro bairro) {
        this.setTipoEndereco(tipoEndereco);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setCep(cep);
        this.setLogradouro(logradouro);
        this.setBairro(bairro);
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    } 
    

}