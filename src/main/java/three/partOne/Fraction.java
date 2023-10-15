package three.partOne;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction addition(Fraction other) {
        // Находим общий знаменатель для сложения дробей
        int commonDenominator = this.denominator * other.denominator;

        // Вычисляем новое значение числителя
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);

        return new Fraction(commonDenominator, newNumerator);
    }

    public Fraction multiply(double number) {
        int newNumerator = (int) (this.numerator * number);
        return new Fraction(newNumerator, this.denominator);
    }

    public Fraction division(double number) {
        int newDenominator = (int) (this.denominator * number);
        return new Fraction(this.numerator, newDenominator);
    }
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }
}
