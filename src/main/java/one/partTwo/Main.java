package one.partTwo;

import javax.swing.*;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.SplittableRandom;

public class Main {
    static SplittableRandom splittableRandom = new SplittableRandom();

    public static void main(String[] args) {
        //1-5.
//        int[] array = splittableRandom.ints(10, -100, 100).toArray();
//        System.out.println(Arrays.toString(array));
//
//        System.out.printf("Avg : %2.2f\n", calculateAvg(array));
//
//        System.out.printf("Max number : %d\n", findMaxNumber(array));
//        System.out.printf("Min number : %d\n", findMinNumber(array));
//
//        findDuplicate(array);
//
//        findSecondMaxNumber(array);
//
//        findSecondMinNumber(array);

        //6.
//        int[] array2 = splittableRandom.ints(5, 1, 6).toArray();
//        System.out.println(Arrays.toString(array2));
//
//        int[] array3 = splittableRandom.ints(5, 1, 6).toArray();
//        System.out.println(Arrays.toString(array3));
//
//        findDuplicateFromTwoMassive(array2, array3);

        //7.
        int[] array4 = splittableRandom.ints(5, 1, 6).toArray();
        System.out.println(Arrays.toString(array4));

        int[] array5 = splittableRandom.ints(5, 1, 6).toArray();
        System.out.println(Arrays.toString(array5));

        findUniqueNumberFromTwoMassive(array4, array5);
    }

    //1.
    public static double calculateAvg(int[] array) {
        double sum = 0;

        for (int num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    //2.
    public static int findMaxNumber(int[] array) {
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    //2.
    public static int findMinNumber(int[] array) {
        int min = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    //3.
    public static void findDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    System.out.println(array[i] + " is duplicate.");
                }
            }
        }
    }

    //4.
    public static void findSecondMaxNumber(int[] array) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        if (max2 != Integer.MIN_VALUE) {
            System.out.println("Second max number : " + max2);
        } else {
            System.out.println("Massive don't have second max number!");
        }
    }

    //5.
    public static void findSecondMinNumber(int[] array) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2 && num != min1) {
                min2 = num;
            }
        }

        if (min2 != Integer.MAX_VALUE) {
            System.out.println("Second min number : " + min2);
        } else {
            System.out.println("Massive don't have second min number!");
        }
    }

    public static void findDuplicateFromTwoMassive(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i] + " is duplicate!");
                }
            }
        }
    }
    public static void findUniqueNumberFromTwoMassive(int[] a, int[] b) {
        for (int numA : a) {
            boolean isUnique = true;

            for (int numB : b) {
                if (numA == numB) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(numA + " є унікальним!");
            }

        }
        for (int numB : b) {
            boolean isUnique = true;

            for (int numA : a) {
                if (numB == numA) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(numB + " є унікальним!");
            }
        }
    }
}
