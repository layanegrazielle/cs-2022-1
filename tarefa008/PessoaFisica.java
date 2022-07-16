import java.sql.Date;
/**
 * @class define pessoa fisica
 * @author layanegrazielle
 * @date 15 de julho de 2022
 */
public class PessoaFisica{

            private String nome;
            private String sexo;
            private Date dataNascimento;
            private Endereco endereco;
            /**
             * Cria pessoa
             * @param nome
             * @param sexo
             * @param dataNascimento
             * @param endereco
             */
            public PessoaFisica(String nome, String sexo, Date dataNascimento, Endereco endereco) {
                this.setNome(nome);
                this.setSexo(sexo);
                this.setDataNascimento(dataNascimento);
                this.setEndereco(endereco);
            }
            public Endereco getEndereco() {
                return endereco;
            }
            public void setEndereco(Endereco endereco) {
                this.endereco = endereco;
            }
            public Date getDataNascimento() {
                return dataNascimento;
            }
            public void setDataNascimento(Date dataNascimento) {
                this.dataNascimento = dataNascimento;
            }
            public String getSexo() {
                return sexo;
            }
            public void setSexo(String sexo) {
                this.sexo = sexo;
            }
            public String getNome() {
                return nome;
            }
            public void setNome(String nome) {
                this.nome = nome;
            }
            
                              
}

