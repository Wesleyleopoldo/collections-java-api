package set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    private Set<Contato> setContatos;

    public AgendaContatos() {
        setContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        setContatos.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(setContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c: setContatos){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for(Contato c: setContatos){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String [] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();
        agendaContatos.adicionarContato("Wesley", 818196);
        agendaContatos.adicionarContato("Emily", 818596);
        agendaContatos.adicionarContato("Wesley", 718896);
        agendaContatos.adicionarContato("Taciana", 98396);
        agendaContatos.adicionarContato("Matheus", 845696);
        agendaContatos.adicionarContato("Doze", 838996);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Taciana"));

        agendaContatos.atualizarNumeroContato("Wesley", 456578);

        agendaContatos.exibirContato();
    }
}
