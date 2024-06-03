package list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;
import list.OperacoesBasicas.Tarefa;

public class ListaTarefa {
    // Atributo...
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){

        System.out.println(tarefaList);
    }

    public static void main(String [] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Wesley");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Wesley");

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Cauan Leopoldo");

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println("As tarefas presentes são: ");
        listaTarefa.obterDescricoesTarefas();
    }
}
