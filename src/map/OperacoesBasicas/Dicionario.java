package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //Atributo
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else
            throw new RuntimeException("O MAP ESTÁ VÁZIO");
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquisaPorPalavras = null;
        if(!dicionarioMap.isEmpty()){
            pesquisaPorPalavras = dicionarioMap.get(palavra);
            return pesquisaPorPalavras;
        } else
            throw new RuntimeException("O MAP ESTÁ VÁZIO");
    }

    public static void main(String [] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Wesley", "Gênio");
        dicionario.adicionarPalavra("Chapolin", "Astucia");
        dicionario.adicionarPalavra("Wilson", "Gay");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Wilson");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Chapolin"));
    }
}
