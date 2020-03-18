
import java.util.Arrays;

public class Søgealgoritme {
    static int[] data1 = {1,2,3,4,5,6,7,8,9,10};
    static int[] data2 = {2,2,4,4,4,6,6,8,9,10};
    static int[] data3 = {2,2,35,4,44,676,6,8636,9,106};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(data1));
        System.out.println(find(data1, 5));
        System.out.println(Arrays.toString(data2));
        System.out.println(findAlle(data2, 4));
        System.out.println(Arrays.toString(data3));
        System.out.println(findMax(data3));
    }

    public static String find(int[] Array, int x) {
        for (int i = 0; i < Array.length; i++) {
            if (i == x) {
                return "Tallet er fundet til at være " + x +" og det er indenfor arrayet";
            }
        }
        return "Tallet er desværre ikke indenfor arrayet";

    }

    public static String findAlle(int[] Array, int x) {
        int gange = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == x) {
                gange++;
            }
        }
            if (gange > 1) {
                return "Tallet er fundet og det er " + gange + " gange i arrayet";
            } else if (gange == 1) {
                return "Tallet er fundet og det er " + gange + " gang i arrayet";
            }
            return "Tallet er desværre ikke indenfor arrayet";
    }

    public static String findMax(int[] Array) {
        // Metode jeg brugte først.
//        int f;
//        for (int i = 0; i < Array.length; i++) {
//            for ( f = 0; f < Array.length; f++) {
//                if (Array[i] < Array[f] || f == Array.length - 1) {
//                    if (f == Array.length -1){
//                        max = Array[i];
//                    }
//                    break;
//                }
//            }
//            if (f == Array.length - 1) {
//                break;
//            }
//        }
        //en bedre metode jeg fandt.
        int max = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > max){
                max = Array[i];
            }
        }
        return "Største tal i arrayet er " + max;
    }
}
