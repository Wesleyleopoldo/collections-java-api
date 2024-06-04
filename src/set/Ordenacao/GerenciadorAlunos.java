package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Set<Aluno> alunoParaRemover = new HashSet<>();
        if(!alunoSet.isEmpty()){
            for(Aluno a: alunoSet){
                if(a.getMatricula() == matricula){
                    alunoParaRemover.add(a);
                    break;
                }
            }
            alunoSet.removeAll(alunoParaRemover);
        } else
            throw new RuntimeException("O SET ESTÁ VÁZIO!!!");
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            return alunosPorNota;
        } else
            throw new RuntimeException("O SET ESTÁ VÁZIO!!!");
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String [] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Wesley Cauan", 1011, 10);
        gerenciadorAlunos.adicionarAluno("Aluno 1", 1545, 9);
        gerenciadorAlunos.adicionarAluno("Bluno 2", 4756, 8.5);
        gerenciadorAlunos.adicionarAluno("Cluno 3", 9654, 7.5);
        gerenciadorAlunos.adicionarAluno("Dluno 4", 4721, 6);
        gerenciadorAlunos.adicionarAluno("Eluno 5", 1306, 5);
        gerenciadorAlunos.adicionarAluno("Fluno 6", 1128, 7);
        gerenciadorAlunos.adicionarAluno("Gluno 7", 1111, 8);
        gerenciadorAlunos.adicionarAluno("Hluno 8", 1111, 9.5);

        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        gerenciadorAlunos.removerAluno(1011);

        gerenciadorAlunos.exibirAlunos();
    }
}
