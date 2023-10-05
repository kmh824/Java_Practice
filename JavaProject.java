import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

// Class
/* 
class Bicycle {
   private int cadence;
    private int gear;
    private int speed;
        
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    public int getCadence() {
        return cadence;
    }
        
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public int getGear() {
        return gear;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public int getSpeed() {
        return speed;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }

}

class MountainBike extends Bicycle {
    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
*/
/*
class CreateObjectDemo {

    public static void main(String[] args) {
        

        // Declare and create a point object and two rectangle objects.
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
        
        
        // display rectOne's width, height, and area
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());
        
        // set rectTwo's position
        rectTwo.origin = originOne;
        
        // display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
        
        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
    }
}

class Point {
    public int x = 0;
    public int y = 0;
    // a constructor!
    public Point(int a, int b) {
    x = a;
    y = b;
    }
    
}

class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;
 
    // four constructors
    public Rectangle() {
    origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
    origin = p;
    }
    public Rectangle(int w, int h) {
    origin = new Point(0, 0);
    width = w;
    height = h;
    }
    public Rectangle(Point p, int w, int h) {
    origin = p;
    width = w;
    height = h;
    }
 
    // a method for moving the rectangle
    public void move(int x, int y) {
    origin.x = x;
    origin.y = y;
    }
 
    // a method for computing the area of the rectangle
    public int getArea() {
    return width * height;
    }
}
*/
/*
class Bicycle {

    private int cadence;
    private int gear;
    private int speed;

    // add an instance variable for the object ID
    private int id;

    // add a class variable for the
    // number of Bicycle objects instantiated
    private static int numberOfBicycles = 0;

}
 */
/*
class JavaStudy8 {
    public static boolean inRect(int x, int y) {
        if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 x와 y좌표를 입력하세요.");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("두 번째 x와 y좌표를 입력하세요.");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        System.out.println((inRect(x1, y1) && inRect(x2, y2)) ? "충돌!" : "충돌하지 않음");
    }
}
 */
/*
 class DataStructure {

    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String s[]) {
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}

class Practice {
    public static void main(String[] args) {
        boolean[] bool = { true, false, false, true };
        double[][] d = new double[5][4];
        int[][] val = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

        char[] alpha = { 'a', 'b', 'c', 'd' };
        for (int i = 0; i < alpha.length; i++)
            System.out.print(alpha[i]);
        for (char c : alpha)
            System.out.print(c);

        double[][] arr = { { 1.1, 1.2, 1.2, 1.4 }, { 2.1, 2.2 }, { 3.1, 3.2, 1.2 }, { 4.1 } };
        double[][] arr1 = new double[4][];
        arr[1][0] = 1.1;
    }
}
*/
public class JavaProject {
    static String[] str = { "가위", "바위", "보" };

    static String RPSgame(String ans, int num) {
        if (str[num].equals(ans))
            return "비겼습니다.";
        else if (ans.equals("가위")) {
            return (str[num].equals("보") ? "사용자가 이겼습니다" : "사용자가 졌습니다");
        } else if (ans.equals("바위")) {
            return (str[num].equals("가위") ? "사용자가 이겼습니다" : "사용자가 졌습니다");
        } else if (ans.equals("보")) {
            return (str[num].equals("바위") ? "사용자가 이겼습니다" : "사용자가 졌습니다");
        } else
            return "다시 입력하세요";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
        while (true) {
            int randomNum = random.nextInt(3);
            System.out.print("가위 바위 보! >> ");
            String answer = scanner.nextLine();
            if (answer.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            } else {
                System.out.println("사용자 = " + answer + " , 컴퓨터 = " + str[randomNum] + "," + RPSgame(answer, randomNum));
            }
        }
        //dd

    }
}
