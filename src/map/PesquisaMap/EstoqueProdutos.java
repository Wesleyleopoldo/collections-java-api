package map.PesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    // atributo

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto preco: estoqueProdutosMap.values()){
                valorTotalEstoque += preco.getQuantidade() * preco.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto preco: estoqueProdutosMap.values()){
            if(preco.getPreco() > maiorPreco){
                produtoMaisCaro = preco;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String [] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto a", 1, 2D);
        estoque.adicionarProduto(2L, "Produto b", 1, 2D);
        estoque.adicionarProduto(3L, "Produto c", 1, 2D);
        estoque.adicionarProduto(4L, "Produto d", 1, 2.15D);
        estoque.adicionarProduto(5L, "Produto e", 1, 13.20D);

        estoque.exibirProdutos();
    }
}
