package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<Integer>();
    }

    public int somarNumeros(){
        int soma = 0;
        if(!numeros.isEmpty()) {
            for (int indice : numeros) {
                soma += indice;
            }
        } else
            throw new RuntimeException("A LISTA ESTÁ VÁZIA!!!");
        return soma;
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){

            System.out.println(this.numeros);

        } else
            throw new RuntimeException("A LISTA ESTÁ VÁZIA!!!");
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(!numeros.isEmpty()) {
            for (int i : numeros) {
                if(i >= maior){
                    maior = i;
                }
            }
        } else
            throw new RuntimeException("A LISTA ESTÁ VÁZIA!!!!");
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for( int indice: numeros){
                if(indice <= menor){
                    menor = indice;
                }
            }
        } else
            throw new RuntimeException("A LISTA ESTÁ VÁZIA!!!!");
        return menor;
    }

    public static void main(String [] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);

        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.somarNumeros());
    }
}