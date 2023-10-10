package one.partOne;

import java.util.Arrays;
import java.util.Random;
import java.util.SplittableRandom;

public class Main {
    static Random random = new Random();
    static SplittableRandom splittableRandom = new SplittableRandom();

    public static void main(String[] args) {
        //1.
        int[] arrayOne = new int[10];

        //2.
        int[] arrayTwo = new int[]{1, 2, 3, 4, 5};

        //3.
        int size = 10;
        int[] arrayThree = new int[size];
        for (int i = 0; i < size; i++) {
            arrayThree[i] = random.nextInt(-10, 11);
        }

        //4.
        double[] arrayFour = splittableRandom.doubles(size, -10, 11).toArray();

        //5.
        int[] arrayFiveOne = splittableRandom.ints(size, -10, 11).toArray();

        int newSize = size + 5;
        int[] arrayFiveTwo = new int[newSize];

        for (int i = 0; i < arrayFiveOne.length; i++) {
            arrayFiveTwo[i] = arrayFiveOne[i];
        }

        //6.
        int[] arraySix = splittableRandom.ints(12, -15, 16).toArray();

        int maxNumber = arraySix[0];
        int indexOfMaxNumber = 0;

        for (int i = 0; i < arraySix.length; i++) {
            if (arraySix[i] >= maxNumber) {
                maxNumber = arraySix[i];
                indexOfMaxNumber = i;
            }
        }

        //7.
        int[] arraySeven = splittableRandom.ints(8, 1, 11).toArray();

        for (int i = 0; i < arraySeven.length; i++) {
            if (i % 2 == 1) {
                arraySeven[i] = 0;
            }
        }

        //8.
        int[] arrayEight = splittableRandom.ints(4, 10, 100).toArray();

        boolean isIncreasing = true;
        for (int i = 1; i < arrayEight.length; i++) {
            if (arrayEight[i] < arrayEight[i - 1]) {
                isIncreasing = false;
            }
        }

        if (isIncreasing) {
//            System.out.println("массив является строго возрастающей последовательностью");
        } else {
//            System.out.println("массив не является строго возрастающей последовательностью");
        }

        //9.
        int arraysSize = 5;
        int[] arrayNineOne = splittableRandom.ints(arraysSize, 0, 6).toArray();
//        System.out.println("First massive : " + Arrays.toString(arrayNineOne));

        int[] arrayNineTwo = splittableRandom.ints(arraysSize, 0, 6).toArray();
//        System.out.println("Second massive : " + Arrays.toString(arrayNineTwo));

        double firstAvg = calculateAvg(arrayNineOne);
        double secondAvg = calculateAvg(arrayNineTwo);

        if (firstAvg > secondAvg) {
//            System.out.println("firstAvg > secondAvg");
        } else if (firstAvg < secondAvg) {
//            System.out.println("firstAvg < secondAvg");
        } else {
//            System.out.println("firstAvg = secondAvg");
        }

        //10.
        int[] arrayTenOne = splittableRandom.ints(50, 0, 1001).toArray();

        int count = 0;
        for (int num : arrayTenOne) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] arrayTenTwo = new int[count];
        int index = 0;
        for (int i = 0; i < arrayTenOne.length; i++) {
            if (arrayTenOne[i] % 2 == 0) {
                arrayTenTwo[index] = arrayTenOne[i];
                index++;
            }
        }

        //11.
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{-1, -2, -3, -4, -5};

        int[] c = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        System.out.println(Arrays.toString(c));

        System.out.println("Hello world!");
    }

    //9.
    public static double calculateAvg(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}
