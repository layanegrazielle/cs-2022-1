import java.util.List;

public class TesteAgenda {
    public static void main(String[] args)  {
        Contato contato1 = new Contato("Ana", "ana@gmail.com");
        Contato contato2 = new Contato("Joao", "joao@email.com");
        Contato contato3 = new Contato("Maria", "maria@email.com");
        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        listarContatos(agenda);
        agenda.excluirContato("Maria");
        listarContatos(agenda);
    }

    private static void listarContatos(Agenda agenda) {
        List<Contato> contatos = agenda.listarContatos(agenda);
        for(int i = 0; i < contatos.size(); i++){
            System.out.print(contatos.get(i).getNome()+ " " + contatos.get(i).getEmail() + "\n");
        }
    }
}
