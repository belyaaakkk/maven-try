package two.partThree.taskThree;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new double[rows][columns];
    }

    public Matrix(double[][] data) {
        this.data = data;
        rows = data.length;
        columns = data[0].length;
    }

    public Matrix add(Matrix other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Матрицы имеют разные размеры и не могут быть сложены.");
        }
        double[][] resultData = new double[rows][columns];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                resultData[i][j] = data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(resultData);
    }

    public void printMatrix() {
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
