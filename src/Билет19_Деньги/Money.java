package Билет19_Деньги;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

/*Класс Деньги для работы с денежными суммами.
Число должно быть представлено двумя полями: типа long для рублей и типа double – для копеек.
 Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
  Реализовать сложение, вычитание,деление сумм,
 деление суммы на дробное число, умножение на дробное число и операции сравнения.
 В классе Тестер проверить эти методы.*/
public class Money {
    private long rubles;
    private double kopeks;

    public Money(long rubles, double kopeks) {
        this.rubles = rubles;
        this.kopeks = kopeks;
    }

    public long getRubles() {
        return rubles;
    }

    public double getKopeks() {
        return kopeks;
    }

    public void setRubles(int rubles) {
        this.rubles = rubles;
    }

    public void setKopeks(double kopeks) {
        this.kopeks = kopeks;
    }

    public Money add(Money money) {
        long newRubles = this.rubles + money.getRubles();
        double newKopeks = this.kopeks + money.getKopeks();
        return new Money(newRubles, newKopeks);
    }

    public Money subtract(Money money) {
        long newRubles = this.rubles - money.getRubles();
        double newKopeks = this.kopeks - money.getKopeks();
        return new Money(newRubles, newKopeks);
    }

    public Money divide(Money money) {
        long newRubles = this.rubles / money.getRubles();
        double newKopeks = this.kopeks / money.getKopeks();
        return new Money(newRubles, newKopeks);
    }

    public Money divide(double number) {
        long newRubles = (long) (this.rubles / number);
        double newKopeks = this.kopeks / number;
        return new Money(newRubles, newKopeks);
    }

    public Money multiply(double number) {
        int newRubles = (int) (this.rubles * number);
        double newKopeks = this.kopeks * number;
        return new Money(newRubles, newKopeks);
    }

    public int compareTo(Money money) {
        if (this.rubles > money.getRubles()) {
            return 1;
        } else if (this.rubles < money.getRubles()) {
            return -1;
        } else {
            if (this.kopeks > money.getKopeks()) {
                return 1;
            } else if (this.kopeks < money.getKopeks()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        String str=Double.toString(Math.abs(kopeks));
        return rubles + "," +str.substring(2);
    }

    public static void main(String args[]){
        Money money1 = new Money(100L, (double) 0.10);
        Money money2 = new Money(200L, (double) 0.20);
        System.out.println(money1.add(money2));
        System.out.println(money1.subtract(money2));
        System.out.println(money1.divide(money2));
        System.out.println(money1.divide(2));
        System.out.println(money1.multiply(1.1));
        System.out.println(money1.equals(money2));//1==2? 1 объект, для которого вызывается метод
        if (money1.compareTo(money2)==-1){
            System.out.println("2 число больше первого");
        }else if(money1.compareTo(money2)==1){
            System.out.println("1 число больше второго");
        }

    }
}