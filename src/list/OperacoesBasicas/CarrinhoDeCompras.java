package list.OperacoesBasicas;

public class CarrinhoDeCompras {
    private String item;

    public CarrinhoDeCompras(String item){
        this.item = item;
    }

    public String getItem(){
        return item;
    }

    @Override
    public String toString(){
        return item;
    }
}
