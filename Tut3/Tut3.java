import java.util.*;

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
    public static void uniqueNumbers () {
// Take the input from user
       Scanner scanner = new Scanner(System.in);
        //           + to have at least 1 maatch
        String[] list = scanner.nextLine().split(" +");
       while (true) {
           boolean invalid = false;
           for (String s:list) {
               if (!s.matches("-?\\d")) {
                   System.out.println("Please enter a valid list of valid integers");
                   invalid = true;
               }
           }

           if (invalid) continue;


        HashMap<String,Integer> map = new HashMap<String, Integer>();

           for (int i= 0; i< list.length ; i++) {
               Integer freq = (Integer) map.get(list[i]);
//               map.put(list[i], (freq == null) ? 1 : new Integer(freq.intValue() + 1));
               map.put(list[i], (freq == null) ? 1 : freq + 1);

           }

           for (String key : map.keySet()) {
               if (map.get(key) > 1)
           }
       }
    }

    //    Exercise 8
    public static int[] regEx () {

/*
* a) 0 or 11 or 101
  0|11|101

 b) only 0s
 0*

 c) all binary strings
 (011)*

 d) all binary strings except empty string
 (011)(0|1)*

 e) begins with 1, ends with 1
 * 1|(001)*|1

 f) ends with 00
 (0|1)*00

 g) contains at least three 1s

 */
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

        //        Ex 6
        System.out.println(Arrays.toString(uniqueNumbers()));
    }
}
