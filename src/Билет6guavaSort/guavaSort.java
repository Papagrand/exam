package Билет6guavaSort;
//Создаете проект maven, в xml файле ниже properties добавляете следующее
/*
    <dependencies>
        <!-- https://mvnrepository.com/artifact/com.google.guava/guava -->
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>31.1-jre</version>
        </dependency>
    </dependencies>
 */

//Затем заходите в src/main/java/org.example, там создаете класс guavaSort и вставляете код снизу

/*
import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;



import java.util.Arrays;

public class guavaSort {
    public static void guavaSort(String[] a) {
        Multiset<String> mset = TreeMultiset.create(); // array -> multiset
        for (String s : a) {
            mset.add(s);
        }
        int i = 0; // multiset -> array
        for (String s : mset) {
            a[i] = s;
            i++;
        }
    }
    public static void main(String[] args) {
        String[] m1 = new String[5];
        m1[0] = "Farm";
        m1[1] = "Zoo";
        m1[2] = "Apple";
        m1[3] = "Apple";
        m1[4] =  "Dog";
        guavaSort.guavaSort(m1);
        System.out.println(Arrays.toString(m1));
    }
}
*/
//Справа сверху в консоли нажать на кнопку с вращающимеся стрелками по кругу, чтобы установить что-то, я хз что
