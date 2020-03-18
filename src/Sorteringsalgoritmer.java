import java.util.Arrays;

public class Sorteringsalgoritmer {
    static int[] data = {3,5,4,8,6,4,8,7,2,4,7,6,5,2};
    static int[] data2 = {5,2,8,4,14,6,1,9,3,7,10,12,11,13};

    public static void main(String[] args) {
        System.out.println("Ikke sorteret");
        System.out.println(Arrays.toString(data));
        System.out.println("Sorteret");
        System.out.println(Bubble(data));
        System.out.println("Ikke sorteret");
        System.out.println(Arrays.toString(data2));
        System.out.println("Sorteret");
        System.out.println(Insertion(data2));

    }
//     Bubble Sort
    public static String Bubble(int[] Array) {
        for (int f = Array.length - 1 ; f > 0 ; f--) {
            for (int i = Array.length - 2; i > -1; i--) {
                if (Array[i] > Array[i + 1]) {
                    int temp = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i + 1] = temp;
                }
            }
        }
        return Arrays.toString(Array);
    }

    public static String Insertion(int[] Array) {
        for (int i = 1; i < Array.length ; i++) {
            int key = Array[i];
            int f = i - 1;
                while (f >= 0 && Array[f] > key) {
                    Array[f + 1] = Array[f];
                    f = f - 1;
                    }
                Array[f + 1] = key;
            }
        return Arrays.toString(Array);
    }



}
