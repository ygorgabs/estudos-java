package generics;

import java.util.ArrayList;
import java.util.List;

public class Matrix<T> {
    private List<List<T>> matrix;
    private static final int SIZE = 3;

    public Matrix() {
        this.matrix = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            List<T> row = new ArrayList<>(SIZE);
            for (int j = 0; j < SIZE; j++) {
                row.add(null);
            }
            this.matrix.add(row);
        }
    }

    public void set(int row, int col, T value) {
        this.matrix.get(row).set(col, value);
    }

    public void print() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(this.matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
