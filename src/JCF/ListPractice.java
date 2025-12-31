package JCF;

import java.util.*;

public class ListPractice {

    static ArrayList<Integer> numbers =
            new ArrayList<>(List.of(2, 3, 6, 5, 48, 1, 0, -56, -5));

    public void reverse() {

        System.out.println("Actual : " + numbers);
        ListIterator<Integer> reversedByIterator = numbers.listIterator(numbers.size());
        System.out.print("reversed: ");
        while (reversedByIterator.hasPrevious()) {
            System.out.print(reversedByIterator.previous() + " ");
        }
        System.out.println();
        SequencedCollection<Integer> reverse = numbers.reversed();
        System.out.println("reversed: " + reverse);
        System.out.println("reversed: " + numbers.reversed());

        ArrayList<Integer> cloned = (ArrayList<Integer>) numbers.clone();
        System.out.println("Cloned : " + cloned);
    }

    static void main() {
        List<Object> objects = new LinkedList<>();
    }
}
