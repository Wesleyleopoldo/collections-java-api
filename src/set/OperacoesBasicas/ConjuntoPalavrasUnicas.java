package set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {

    private String palavra;

    public String getPalavra() {
        return palavra;
    }

    private Set<String> conjuntoPalavrasUnicas = new HashSet<>();

    public void adicionarPalavras(String palavra){
        conjuntoPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        if(!conjuntoPalavrasUnicas.isEmpty()){
            for(String p: conjuntoPalavrasUnicas){
                if(p == palavra){
                    palavraParaRemover = p;
                }
            }
            conjuntoPalavrasUnicas.remove(palavraParaRemover);
        } else
            throw new RuntimeException("O SET ESTÁ VÁZIO!!!");
    }

    public boolean verificarPalavra(String palavra){
        boolean palavraEncontrada = false;
        if(!conjuntoPalavrasUnicas.isEmpty()){
            for(String p: conjuntoPalavrasUnicas){
                if(p == palavra) {
                    palavraEncontrada = true;
                    break;
                }
            }
            return palavraEncontrada;
        } else
            throw new RuntimeException("O SET ESTÁ VÁZIO!!!");
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavrasUnicas);
    }

    public static void main(String [] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavras("Paralelepipedo");
        conjuntoPalavrasUnicas.adicionarPalavras("Wesley");
        conjuntoPalavrasUnicas.adicionarPalavras("AlgumaCoisa");

        conjuntoPalavrasUnicas.removerPalavra("Wesley");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Wesley"));
    }
}
