package list.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoa {
    // Atributo

    private List<Pessoa> listPessoa;

    public OrdenacaoPessoa(){
        this.listPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String [] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Wesley Cauan", 19, 1.90);
        ordenacaoPessoa.adicionarPessoa("Taciana Francisca", 36, 1.65);
        ordenacaoPessoa.adicionarPessoa("Emily Thainá", 24, 1.69);
        ordenacaoPessoa.adicionarPessoa("Filipe Barbosa", 28, 1.85);
        ordenacaoPessoa.adicionarPessoa("Thalia Alexsandra", 27, 1.60);
        ordenacaoPessoa.adicionarPessoa("Antonina França", 14, 1.59);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

        System.out.println(ordenacaoPessoa.listPessoa);

    }
}
