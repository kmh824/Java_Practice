import java.util.Arrays;

public class JavaProject {

    public static void main(String[] args) {
        //int[] anArray = new int[10];
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.print(array[0].length);
    }
}
class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}

class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto" };
        int[] c = {1, 2, 3};
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }

        int index = java.util.Arrays.binarySearch(c, 1);
        System.out.println(index);

        boolean bool = java.util.Arrays.equals(copyFrom, copyTo);
        java.util.Arrays.fill(c, 0);
        Arrays.sort(c);
    }
}
