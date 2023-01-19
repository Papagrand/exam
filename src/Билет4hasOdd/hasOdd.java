package Билет4hasOdd;

import java.util.HashSet;
import java.util.Set;

public class hasOdd {
    public static boolean hashOdd(Set<Integer> set){
        if(set.isEmpty()){//проверка на пустоту
            return false;
        }
        else{
            for(Integer i: set){//В качестве i принимается значение каждого последующего элемента set, начиная с 0вого
                if(i % 2 == 1){
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(4);
        set1.add(6);
        System.out.println(hashOdd(set1));
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(2);
        System.out.println(hashOdd(set2));
    }
}