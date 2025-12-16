package DSA;

import java.util.LinkedList;
import java.util.List;

// This is a Leet code task
public class AddTwoNumbers {

    private static final List<Integer> linkedListOne = new LinkedList<>(List.of(2, 7, 14, 6, 12, 36, 54));
    private static final List<Integer> linkedListTwo = new LinkedList<>(List.of(8, 3, 6, 4, 12));

    public static void operation() {
        List<Integer> combiningThemTemp = new LinkedList<>();


        // ============Equal sized array=============
        if (linkedListOne.size() == linkedListTwo.size()) {
            for (int i = 0; i < linkedListOne.size(); i++) {
                int temp = linkedListOne.get(i) + linkedListTwo.get(i);
                combiningThemTemp.add(temp);
            }
        }

        // ============One is bigger=============
        if (linkedListOne.size() > linkedListTwo.size()) {
            int diff = linkedListOne.size() - linkedListTwo.size();
            for (int i = 0; i < diff; i++) {
                linkedListTwo.add(0);
            }
            for (int i = 0; i < linkedListOne.size(); i++) {
                int temp = linkedListOne.get(i) + linkedListTwo.get(i);
                combiningThemTemp.add(temp);
            }
        }

        // ============Two is bigger=============
        if (linkedListOne.size() < linkedListTwo.size()) {
            int diff = linkedListTwo.size() - linkedListOne.size();
            for (int i = 0; i < diff; i++) {
                linkedListOne.add(0);
            }
            for (int i = 0; i < linkedListOne.size(); i++) {
                int temp = linkedListOne.get(i) + linkedListTwo.get(i);
                combiningThemTemp.add(temp);
            }
        }

        System.out.println(combiningThemTemp);
    }

    static void main() {
        AddTwoNumbers.operation();
    }

}
