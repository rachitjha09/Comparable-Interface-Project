import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printArray(double[] data){
        for(double d: data){
            System.out.print(d + " ");
        }
    }
    public static void main(String[] args) {
        /*
        ArrayList<String> list=new ArrayList<String>(Arrays.asList("apple", "pear", "banana", "pecan"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Double> data=new ArrayList<Double>(Arrays.asList(4.5, -9.0, 5.6, 0.0, 2.3));
        System.out.println(data);
        Collections.sort(data);
        System.out.println(data);
         */
        Dog a=new Dog("Luna", 13, 40.0);
        Dog b=new Dog("Bryce", 0, 39.0);
        Dog c=new Dog("Thryce", 13, 2.3);
        Dog d=new Dog("Vice", 5, 99.3);
        Dog e=new Dog("Slice", 15, 47.3);
        ArrayList<Dog> dogs=new ArrayList<Dog>(Arrays.asList(a, b, c, d, e));

        Collections.sort(dogs);
        System.out.println(dogs);
    }
}