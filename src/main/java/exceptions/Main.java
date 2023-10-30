package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//1       int a = 0, b = 0, c = 0;
//        Random random = new Random();
//
//        for (int i = 0; i < 32000; i++) {
//            try {
//                b = random.nextInt();
//                c = random.nextInt();
//                a = 12345 / (b / c);
//            } catch (ArithmeticException e){
//                System.out.println("Исключение : " + e);
//                a = 0;
//            }
//            System.out.println("a: " + a);
//
//        }
//2        try {
//            int a = args.length;
//
//            int b = 42 / a;
//            System.out.println("a = " + a);
//            try {
//                if (a == 1) {
//                    a = a / (a - a);
//                }
//                if (a == 2) {
//                    int[] c = {1};
//                    c[42] = 99;
//                }
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Выход за допустимые пределы индекса в масиве : " + e);
//            }
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на ноль: " + e);
//        }
//        try {
//            throwOne();
//        } catch (IllegalAccessException e){
//            System.out.println("Перехвачено " + e);
//        }
        try {
            FileWriter fileWriter = new FileWriter("out.txt");
            fileWriter.close();
            fileWriter.write("Hello world!");
        } catch (IOException e) {
            System.err.println("Ошибка - нельзя записать в закрытый файл!");
        }
    }

    static void throwOne() throws IllegalAccessException {
        System.out.println("Внутри throwOne().");
        throw new IllegalAccessException("demo");
    }
}
