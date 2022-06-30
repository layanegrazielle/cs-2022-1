public class Estado{
    
        String sigla;
        String nome;
        private Pais pais;

        public Estado(String sigla, String nome, Pais pais) {
            this.sigla = sigla;
            this.nome = nome;
            this.setPais(pais);
        }

        public Pais getPais() {
            return pais;
        }

        public void setPais(Pais pais) {
            this.pais = pais;
        }
    
}