/**
 * @class define estado
 * @author layanegrazielle
 * @date 15 de julho de 2022
 */

public class Estado{
    
    String sigla;
    String nome;
    private Pais pais;
/**
 * Cria estado
 * @param sigla
 * @param nome
 * @param pais
 */
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