import java.util.Scanner;

public class Tutorial2 {
    public static void q1() {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Enter the length: ");
        length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void q2() {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Enter the length: ");
        length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == length - 1) System.out.print("*");
                else if (j == 0 || j == length - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static double q3() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number > 1: ");
        number = scanner.nextInt();
        while (number <= 1) {
            System.out.print("The number has to be > 1. Enter again: ");
            number = scanner.nextInt();
        }
        double min = 1, max = number;
        double avg = (min + max) / 2;
        while (Math.abs(avg * avg - number) > 0.00000001) {
            if (avg * avg > number) max = avg;
            else if (avg * avg < number) min = avg;
            avg = (min + max) / 2;
        }
        return avg;
    }

    public static void q4(double money) {
        double moneyPaid = Math.floor(money * 100 / 3) / 100;
        System.out.println(moneyPaid);
        int intMoney = (int) (money * 100);
        int remainder = intMoney % 3;
        System.out.println(remainder);
        if (remainder == 0) {
            System.out.printf("Each person has to pay: %.2f ", moneyPaid);
        }
        if (remainder == 1) {
            System.out.printf("You and your friend pay: %.2f, the other friend pays %.2f", moneyPaid, moneyPaid + 1 / 100.0);
        }
        if (remainder == 2) {
            System.out.printf("You pay: %.2f, the other friend pays %.2f", moneyPaid, moneyPaid + 1 / 100.0);
        }
    }

    public static void q5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle 1's coordinates and radius: ");
        double x1, y1, rad1;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        rad1 = scanner.nextDouble();
        System.out.println("Enter circle 2's coordinates and radius:");
        double x2, y2, rad2;
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        rad2 = scanner.nextDouble();
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        if (distance <= Math.abs(rad1 - rad2)) {
            System.out.println("Circle 2 is inside circle 1");
        } else if (distance <= rad1 + rad2) {
            System.out.println("Circle 2 overlaps circle 1");
        } else {
            System.out.println("Outside");
        }
    }

    public static void q6() {
        int min = 0;
        int max = 9;
        int range = max - min + 1;
        int[] numbers = new int[max + 1];
        for (int i = 0; i < 100; ++i) {
            int rand = (int) (Math.random() * range) + min;
            numbers[rand] += 1;
        }
        for (int i = min; i <= max; ++i) {
            if (numbers[i] > 0) System.out.println(i + ": " + numbers[i]);
        }
    }

    public static void main(String args[]) {
//        q1();
//        q2();
//        System.out.println(q3());
        q4(10);
//        q5();
        //        q6();
    }
}