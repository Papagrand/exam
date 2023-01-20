package Билет24Комплекс_Рац;

public class CompleksNumb extends Number {
    protected double coefficient;
    protected String num;

    public CompleksNumb() {
        coefficient = 20.5;
        num = "i";
    }


    @Override
    public String toString() {
        return "Number: Compleks, coefficient and number:" + this.coefficient + this.num;
    }
}