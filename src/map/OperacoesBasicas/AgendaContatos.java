package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributos...
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome,Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String [] args) {
        AgendaContatos agendaContatosMap = new AgendaContatos();

        agendaContatosMap.adicionarContato("Wesley Cauan", 81996220);
        agendaContatosMap.adicionarContato("Contato 1", 81542420);
        agendaContatosMap.adicionarContato("Contato 2", 8453220);
        agendaContatosMap.adicionarContato("Contato 3", 8194570);
        agendaContatosMap.adicionarContato("Wesley Cauan", 819356420);

        agendaContatosMap.exibirContatos();
    }

}
