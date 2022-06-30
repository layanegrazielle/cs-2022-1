public class  Logradouro{
        private String nome;
        private TipoLogradouro tipoLogradouro;

        public Logradouro(String nome, TipoLogradouro tipoLogradouro) {
            this.setNome(nome);
            this.setTipoLogradouro(tipoLogradouro);
        }

        public TipoLogradouro getTipoLogradouro() {
            return tipoLogradouro;
        }

        public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
            this.tipoLogradouro = tipoLogradouro;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

}