package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        String tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.getDescricao() == descricao){
                    tarefaParaRemover = descricao;
                    tarefaSet.remove(descricao);
                    break;
                }
            }
        } else
            throw new RuntimeException("O SET ESTÁ VAZIO!!!");
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println("O número de Tarefas no Set é " + tarefaSet.size());
    }

    public String obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa f: tarefaSet){
                if(f.isConcluida() == true){
                    tarefasConcluidas.add(f);
                }
            }
            return "As tarefas concluidas são: " + tarefasConcluidas;
        } else
            throw new RuntimeException("O SET ESTÁ VÁZIO!!!");
    }

    public String obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.isConcluida() == false){
                    tarefasPendentes.add(t);
                }
            }
            return "As tarefas pendentes são: " + tarefasPendentes;
        } else
            throw new RuntimeException("O SET ESTÁ VÁZIO!!!");
    }

    public void marcarTarefaConcluida(String tarefa) {
        if(!tarefaSet.isEmpty()) {
            for(Tarefa t: tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(tarefa)){
                    t.setConcluida(true);
                    break;
                }
            }
        } else
            throw new RuntimeException("A LISTA ESTÁ VÁZIA");
    }

    public void marcarTarefaPendente(String tarefa) {
        if(!tarefaSet.isEmpty()) {
            for(Tarefa t: tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(tarefa)){
                    t.setConcluida(false);
                    break;
                }
            }
        } else
            throw new RuntimeException("A LISTA ESTÁ VÁZIA!!!");
    }

    public void limparListaTarefas(){
        Set<Tarefa> limparTarefas = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                limparTarefas.add(t);
            }
            tarefaSet.remove(limparTarefas);
        } else
            throw new RuntimeException("A LISTA ESTÁ VÁZIA!!!");
    }

    public static void main(String [] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Varrer a casa");
        listaTarefas.adicionarTarefa("Lavar louça");
        listaTarefas.adicionarTarefa("Limpar o banheiro");
        listaTarefas.adicionarTarefa("Passar pano");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Varrer a casa");
        listaTarefas.marcarTarefaConcluida("Lavar louça");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Lavar louça");

        System.out.println(listaTarefas.obterTarefasConcluidas());
    }
}
