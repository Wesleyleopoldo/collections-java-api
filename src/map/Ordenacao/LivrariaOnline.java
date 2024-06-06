package map.Ordenacao;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> acervo;

    public LivrariaOnline() {
        this.acervo = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        acervo.put(link, new Livro(titulo, autor, preco ));
    }

    public void removerLivro(String titulo){
        if(!acervo.isEmpty()){
            acervo.remove(titulo);
        } else
            throw new RuntimeException("O MAP ESTÁ VÁZIOOO!!!");
    }

    public void exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> livrosOrdenados = new TreeMap<>(acervo);
        System.out.println(acervo);
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> pesquisarPorAutor = new LinkedHashMap<>();
        if(!acervo.isEmpty()){
            for(Map.Entry<String, Livro> livro: acervo.entrySet()){
                Livro l = livro.getValue();
                if(l.getAutor().equals(autor)){
                    pesquisarPorAutor.put(livro.getKey(), l);
                }
            }
            return pesquisarPorAutor;
        } else
            throw new RuntimeException("O MAP ESTÁ VÁZIOOO!!!");
    }

    public List<Livro> obterLivroMaisCaro(){
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto =  Double.MIN_VALUE;


    }
}
