package list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    // Atributo
    private List<Livro> listLivro;

    public CatalogoLivros(){
        listLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listLivro.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listLivro.isEmpty()){
            for(Livro l: listLivro) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!listLivro.isEmpty()) {
            for(Livro l: listLivro) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!listLivro.isEmpty()){
            for(Livro l: listLivro) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String [] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Java", "Wesley", 2024);
        catalogoLivros.adicionarLivro("Swift", "Cauan", 2027);
        catalogoLivros.adicionarLivro("Angular", "Leopoldo", 2025);
        catalogoLivros.adicionarLivro("JavaScript", "Silva", 2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Cauan"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2024));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java"));

    }

}
