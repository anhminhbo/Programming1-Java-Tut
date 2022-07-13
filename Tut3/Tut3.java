import java.util.*;
import java.util.Scanner;

public class Tut3 {
    //    Exercise 2
    public static int getIndexMin (int[] numbers) {

        return getIndexMinFrom(numbers,0);
    }
//    Exercise 3
    public static int getIndexMinFrom (int[] numbers, int from) {
        int minIndex = from;
        for (int i= from; i< numbers.length ; i++) {
            if (numbers[i] < numbers[minIndex] ) minIndex = i;
        }

        return minIndex;
    }

    //    Exercise 4
    public static int[] exchangeMinFrom (int[] numbers, int from) {
        int minIndex = getIndexMinFrom(numbers,from);
        int temp = numbers[minIndex];
        numbers[minIndex] = numbers[from];
        numbers[from] = temp;

        return numbers;
    }

    //    Exercise 5
    public static int[] sortBySelection (int[] numbers) {

        for (int i= 0; i< numbers.length ; i++) {
           numbers =  exchangeMinFrom(numbers,i);
        }

        return numbers;
    }

    //    Exercise 6
    public static int[] sortBySelection (int[] numbers) {

        for (int i= 0; i< numbers.length ; i++) {
            numbers =  exchangeMinFrom(numbers,i);
        }

        return numbers;
    }

    public static void main(String args[]) {
    //        Ex 2
        System.out.println(getIndexMin(new int[]{0,1,6,5,4,3,3}));

        // Ex 3
        System.out.println(getIndexMinFrom(new int[]{0,1,6,5,4,3,3},3));

//        Ex 4
        System.out.println(Arrays.toString(exchangeMinFrom(new int[]{0,1,6,5,4,3,3},3)));

        //        Ex 5
        System.out.println(Arrays.toString(sortBySelection(new int[]{0,1,6,5,4,3,3})));

    }
}
