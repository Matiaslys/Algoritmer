
import java.util.Arrays;

public class Søgealgoritme {
    static int[] data1 = {1,2,3,4,5,6,7,8,9,10};
    static int[] data2 = {2,2,4,4,4,6,6,8,9,10};
    static int[] data3 = {2,2,35,4,44,676,6,8636,9,106};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(data1));
        System.out.println(find(5));
        System.out.println(Arrays.toString(data2));
        System.out.println(findAlle(4));
        System.out.println(Arrays.toString(data3));
        System.out.println(findMax());

    }
    public static String find(int x) {

        for (int i = 0; i < data1.length; i++) {
            if (i == x) {
                return "Tallet er fundet til at være " + x +" og det er indenfor arrayet";
            }
        }
        return "Tallet er desværre ikke indenfor arrayet";

    }

    public static String findAlle(int x) {
        int gange = 0;
        for (int i = 0; i < data2.length; i++) {
            if (data2[i] == x) {
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

    public static String findMax() {
        int max = 0;
        int f;
        for (int i = 0; i < data3.length; i++) {
            for ( f = 0; f < data3.length; f++) {
                if (data3[i] < data3[f] || f == data3.length - 1) {
                    if (f == data3.length -1){
                        max = data3[i];
                    }
                    break;
                }
            }
            if (f == data3.length - 1) {
                break;
            }
        }
        return "Største tal i arrayet er " + max;
    }
}
