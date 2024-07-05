package project4;

import java.util.Arrays;

public class IntegerSet {
    private boolean[] set;
    private static final int MAX_SIZE = 101;

    public IntegerSet() {
        set = new boolean[MAX_SIZE];
    }
    public IntegerSet union(IntegerSet otroSet) {
        IntegerSet resultado = new IntegerSet();
        for (int i = 0; i < MAX_SIZE; i++) {
            resultado.set[i] = this.set[i] || otroSet.set[i];
        }
        return resultado;
    }
    public IntegerSet interseccion(IntegerSet otroSet) {
        IntegerSet resultado = new IntegerSet();
        for (int i = 0; i < MAX_SIZE; i++) {
            resultado.set[i] = this.set[i] && otroSet.set[i];
        }
        return resultado;
    }
    public void insertsElement(int k) {
        if (k >= 0 && k < MAX_SIZE) {
            set[k] = true;
        }
    }
    public void deleteElement(int m) {
        if (m >= 0 && m < MAX_SIZE) {
            set[m] = false;
        }
    }
    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < MAX_SIZE; i++) {
            if (set[i]) {
                if (!isEmpty) {
                    sb.append(" ");
                }
                sb.append(i);
                isEmpty = false;
            }
        }
        return isEmpty ? "-" : sb.toString();
    }

    public boolean equalTo(IntegerSet otroSet) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (this.set[i] != otroSet.set[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "IntegerSet{" +
                "set=" + Arrays.toString(set) +
                '}';
    }
}
