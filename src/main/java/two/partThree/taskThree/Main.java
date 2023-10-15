package two.partThree.taskThree;

import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        double[][] data1 = {{1.0, 2.0}, {3.0, 4.0}};

        double[][] data2 = {{5.0, 6.0}, {7.0, 8.0}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        System.out.println("Матрица 1:");
        matrix1.printMatrix();

        System.out.println("Матрица 2:");
        matrix2.printMatrix();

        System.out.println();

        Matrix sumMatrix = matrix1.add(matrix2);

        System.out.println("Сумма матриц:");
        sumMatrix.printMatrix();
    }
}
