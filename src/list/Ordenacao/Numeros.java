package list.Ordenacao;

import java.lang.Comparable;

public class Numeros implements Comparable<Numeros>{

    private int numeros;

    public Numeros(int numeros) {
        this.numeros = numeros;
    }

    @Override
    public int compareTo(Numeros o) {
        return 0;
    }

    public int getNumeros() {
        return numeros;
    }

}
