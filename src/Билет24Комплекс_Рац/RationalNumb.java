package Билет24Комплекс_Рац;

public class RationalNumb extends Number {
    protected double coefficient;
    public RationalNumb() {

        coefficient = 0.65;

    }



    @Override
    public String toString() {
        return "Number: Rational, number:" + this.coefficient ;
    }
}