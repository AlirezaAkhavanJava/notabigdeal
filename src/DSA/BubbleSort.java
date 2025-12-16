package DSA;

public class BubbleSort {
    private final int[] arr = {17, 5, 612, 10, 2, 3, 4, 11, 33};
    private final int size = arr.length;

    public void sort() {

        System.out.println(size);

        System.out.println("Before : ");
        for (int t : arr){
            System.out.print(t + "  ");
        }

        //Actual sorting logic
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++ /*Start one step behind*/) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }


        System.out.println();
        System.out.println("After : ");
        for (int t : arr){
            System.out.print(t + "  ");
        }
    }


    static void main() {
        BubbleSort b = new BubbleSort();
        b.sort();
    }
}
