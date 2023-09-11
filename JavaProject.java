import java.util.Arrays;
import java.util.Collections;
/*
import javax.sql.rowset.spi.SyncResolver;

public class JavaProject {

    public static void main(String[] args) {
        // int[] anArray = new int[10];
        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 }
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
        int[] c = { 1, 2, 3 };
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }

        int index = java.util.Arrays.binarySearch(c, 1);
        System.out.println(index);

        boolean bool = java.util.Arrays.equals(copyFrom, copyTo);
        java.util.Arrays.fill(c, 0);
    }
}

class copyMain {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        // 복사하고자하는 오리지널 배열 넣고, 복사하고자하는 총범위를 뒤에 넣어줌
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

class Sort {
    public static void main(String[] args) {
        int arr[] = { 4, 23, 33, 15, 17, 19 };
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print("[" + i + "]");
        }
        System.out.println();

        Integer arrInteger[] = { 4, 23, 33, 15, 17, 19 };
        Arrays.sort(arrInteger, Collections.reverseOrder());

        for (int i : arrInteger) {
            System.out.print("[" + i + "]");
        }
    }
}

class BreakWithLabelDemo {
    public static void main(String[] args) {

        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

        search: for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}

class ContinueDemo {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");

    }
}

class Test {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        int len = 0;

        switch (day) {
            case MONDAY, FRIDAY, SATURDAY -> len = 6;
            case TUESDAY -> len = 7;
            case THURSDAY -> len = 8;
            case WEDNESDAY -> len = 9;
        };
        System.out.println("len = " + len);
        int quarter = 1; // any value

        String quarterLabel = switch (quarter) {
            case 0:
                yield "Q1 - Winter";
            case 1:
                yield "Q2 - Spring";
            case 2:
                yield "Q3 - Summer";
            case 3:
                yield "Q3 - Summer";
            default:
                System.out.println("Unknown quarter");
                yield "Unknown quarter";
        };
        System.out.println(quarterLabel);
    }

}
 */

class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public void setCadence(int newValue){
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}