package DSA;

import java.util.LinkedList;
import java.util.List;

// This is a Leet code task
public class AddTwoNumbers {

    private static List<Integer> linkedListOne = new LinkedList<>(List.of(2, 7, 14, 6));
    private static List<Integer> linkedListTwo = new LinkedList<>(List.of(8, 3, 6));

    public static void operation() {
        List<Integer> combiningThem = new LinkedList<>();

        for (int i = 0; i < linkedListOne.size(); i++) {
            if (linkedListOne.size() == linkedListTwo.size()) {
                int temp = linkedListOne.get(i) + linkedListTwo.get(i);
                combiningThem.add(temp);
            }
        }

        System.out.println(combiningThem);
    }

    static void main() {
        AddTwoNumbers.operation();
    }

}
