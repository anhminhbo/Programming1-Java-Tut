import java.util.Scanner;

public class questionThree {
    public static void main(String []args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter S");
        int s = keyboard.nextInt();

        int h = s/3600;
        int m = (s%3600)/60;
        int sec = ((s%3600)%60);

        System.out.println(h+":" + m + ":" + sec);
    }
}
