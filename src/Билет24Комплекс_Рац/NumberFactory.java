package Билет24Комплекс_Рац;

public class NumberFactory {
    public enum Numbers {
        Rational,
        Compleks
    }
    public Number getNumber(Numbers type) {
        Number number1 = null;

        switch (type) {
            case Rational:
                number1 =  new RationalNumb();
                break;
            case Compleks:
                number1 = new CompleksNumb();
                break;
        }

        return number1;
    }
    public static void main(String[] args) {
        NumberFactory factory = new NumberFactory();

        Number rational = factory.getNumber(Numbers.Rational);
        Number compleks = factory.getNumber(Numbers.Compleks);
        System.out.println(rational);
        System.out.println(compleks);

    }
}