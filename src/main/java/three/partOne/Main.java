package three.partOne;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);

        Fraction sum = fraction1.addition(fraction2);
        System.out.print("Сумма дробей: ");
        sum.print();

        Fraction product = fraction1.multiply(2.5);
        System.out.print("Умножение на 2.5: ");
        product.print();

        Fraction quotient = fraction2.division(2.0);
        System.out.print("Деление на 2.0: ");
        quotient.print();
    }
}
