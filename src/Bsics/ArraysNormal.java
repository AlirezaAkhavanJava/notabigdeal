package Bsics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysNormal {
    public static void operation() {
        Object[] isSame = new Object[5];
        isSame[0] = "Bobo";
        isSame[1] = 2;
        System.out.println(Arrays.toString(isSame));
        List<Integer> numbers = new ArrayList<>(List.of(2, 4, 65, 22, 13, 90));
        List<Integer> evenNumbers = numbers.stream().filter(integer -> integer % 2 == 0).toList();
        List<Integer> oddNumbers = numbers.stream().filter(integer -> integer % 2 != 0).toList();
        System.out.println("============================================================================");
        System.out.println("Even numbers : " + evenNumbers);
        System.out.println("Odd numbers : " + oddNumbers);
        System.out.println("============================================================================");
        List<Object> objects = new ArrayList<>(List.of("Sam", true, 14D, "Bob", "21", 213, 3.2F));
        for (Object i : objects) {
            switch (i) {
                case Integer integer -> System.out.println("Integer : " + integer);
                case Float f -> System.out.println("Float : " + f);
                case Boolean bool -> System.out.println("Boolean : " + bool);
                case Double d -> System.out.println("Double : " + d);
                case String s -> System.out.println("String : " + s);
                default -> System.out.println("WTF ??");
            }
        }
    }

    static void main() {
        operation();
    }


}
