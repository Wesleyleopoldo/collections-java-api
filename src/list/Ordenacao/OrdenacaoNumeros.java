package list.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    // Atributo
    private List<Integer> numerosList = new ArrayList<>();

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }else
            throw new RuntimeException("A LISTA ESTÁ VÁZIA");
    }

    public List<Integer> ordenarDescendentes(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            numerosAscendentes.sort(Collections.reverseOrder());
            return numerosAscendentes;
        } else
            throw new RuntimeException("A LISTA ESTÁ VÁZIA");
    }

    public static void main(String [] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(43);
        ordenacaoNumeros.adicionarNumero(44);
        ordenacaoNumeros.adicionarNumero(50);
        ordenacaoNumeros.adicionarNumero(88);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendentes());
    }
}
