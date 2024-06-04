package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produtos> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produtos(cod, nome, preco, quantidade));
    }

    public Set<Produtos> exibirProdutoPorNome(){
        Set<Produtos> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produtos> exibirProdutosPorPreco(){
        Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String [] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1234l, "Baygon", 121.34, 1);
        cadastroProdutos.adicionarProduto(1234l, "Vodka", 12.34, 1);
        cadastroProdutos.adicionarProduto(2734l, "Agua", 11.34, 1);
        cadastroProdutos.adicionarProduto(1243l, "Chocolate", 1.34, 1);
        cadastroProdutos.adicionarProduto(1235l, "Nestle", 141.34, 1);

        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}