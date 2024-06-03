package list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class Itens {
    private List<CarrinhoDeCompras> carrinhoDeCompras;

    public Itens(){
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String item){
        carrinhoDeCompras.add(new CarrinhoDeCompras(item));
    }

    public void removerItem(String item){
        List<CarrinhoDeCompras> itensParaRemover = new ArrayList<>();
        for(CarrinhoDeCompras i: carrinhoDeCompras){
            if(i.getItem().equalsIgnoreCase(item)){
                itensParaRemover.add(i);
            }
        }
        carrinhoDeCompras.removeAll(itensParaRemover);
    }

    public int obterNumeroDeItens(){
        return carrinhoDeCompras.size();
    }

    public void obterDetalhesDosItens(){
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String [] args) {
        Itens itens = new Itens();

        itens.adicionarItem("Danone");

        itens.adicionarItem("Leite");

        itens.adicionarItem("Carrinho");

        System.out.println("O número de itens no carrinho é: " + itens.obterNumeroDeItens());

        itens.adicionarItem("Chupetinha");

        itens.removerItem("Danone");

        itens.removerItem("Leite");

        System.out.println("O número de itens no carrinho é: " + itens.obterNumeroDeItens());

        itens.obterDetalhesDosItens();
    }
}
