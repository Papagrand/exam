package Билет30_RecursPow2;

public class Recurs {
    public static void chechPow2(int N,int powTwo){
        if(powTwo==N){
            System.out.println("YES");
        } else if (powTwo>N) {
            System.out.println("NO");
        }else {
            chechPow2(N,powTwo*2);
        }

    }

    public static void main(String[] args) {
        chechPow2(32,1);
    }
}