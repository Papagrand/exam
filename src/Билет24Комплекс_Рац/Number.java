package Билет24Комплекс_Рац;

public class Number {
    protected String color;
    protected boolean filled;

    public Number() {
        this.color = "BLUE";
        this.filled = true;
    }



    public String toString() {
        return this.color + " " + this.filled;
    }
}