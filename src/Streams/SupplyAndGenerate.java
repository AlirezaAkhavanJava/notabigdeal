package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplyAndGenerate {
    static Supplier<Object> supplier = new Supplier<>() {
        int counter = 0;
        char character = 'a';

        @Override
        public Object get() {
            return "Stream : " + counter++ + character++;
        }
    };

    static Consumer<Object> consumer = new Consumer<Object>() {
        @Override
        public void accept(Object o) {
            System.out.println(o);
        }
    };

    public static void operation() {
        Stream<Object> stream = Stream.generate(supplier).limit(10);
        stream.forEach(consumer);
    }


    static void main() {
        operation();
    }
}
