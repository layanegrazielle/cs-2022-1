import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos = new ArrayList<Contato>();

    public void adicionarContato(Contato contato) {
		contatos.add(contato);
    }

    public Contato buscarContato(String parteContato){
            Contato novoContato = new Contato();

		for (Contato Contato : contatos) {
			if(((Contato) contatos).getNome().equals(parteContato) || ((Contato) contatos).getEmail().equals(parteContato)) {
				novoContato = Contato;
			}
		}
		return novoContato;   
	}

    public void excluirContato(String nome){
            
            for(int i = 0; i < contatos.size(); i++){
                    if(contatos.get(i).getNome().equals(nome)){
                        contatos.remove(contatos.get(i));
                    }
                
            }
    }
    public  List<Contato> listarContatos(Agenda agenda){
        for(int i = 0; i < contatos.size(); i++){
            //System.out.print(contatos.get(i).getNome() + contatos.get(i).getEmail());
        }
        return contatos;
    }
    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
}
