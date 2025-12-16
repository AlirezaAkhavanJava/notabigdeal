package Streams.Function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionExample {

    private static final Function<Integer, Integer> addOneFunction =
            number -> number + 1;

    private static final Function<Integer, Integer> doubleFunction =
            number -> number * 2;

    private static final Function<Integer, Integer> powerIt =
            number -> number * number;


    private static final Function<Integer, Integer> doubleItThenAddOneFunction =
            doubleFunction.andThen(addOneFunction); /* (2x + 1) */

    private static final Function<Integer, Integer> powerItThendoubleItThenAddOneFunction =
            doubleItThenAddOneFunction.andThen(powerIt); /* (2x + 1) * (2x + 1) */


    public static Integer sumMethod(Integer a) {
        return a + 1;
    }

    static void main() {

        int resultMethod = sumMethod(10);
        System.out.println(resultMethod);

        System.out.println("Functional approach : ");
        int resultFunction = addOneFunction.apply(10);
        System.out.println(resultFunction);

        System.out.println("=======================");
        System.out.println(doubleItThenAddOneFunction.apply(10));

        System.out.println("=======================");
        System.out.println(powerItThendoubleItThenAddOneFunction.apply(10));

    }

}
