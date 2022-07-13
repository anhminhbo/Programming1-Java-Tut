package Tut1;


import java.lang.*;
import java.util.Scanner;
public class questionFour {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter Ax");
        int Ax = keyboard.nextInt();

        System.out.println("enter Ay");
        int Ay = keyboard.nextInt();

        System.out.println("enter Bx");
        int Bx = keyboard.nextInt();

        System.out.println("enter By");
        int By = keyboard.nextInt();

        double AB = Math.sqrt((Ax-Bx)*(Ax-Bx) + (Ay-By)*(Ay-By));

        double area = AB*AB;
        double peri = AB*4;

        System.out.println((int)area);
        System.out.println((int) peri);

    }
}
