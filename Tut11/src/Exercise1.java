import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String args[]) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Please type in a valid file name: ");
            name = scanner.nextLine();
        } while (!checkIfFileExists(name));
        BufferedReader br = new BufferedReader(new FileReader(name));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }

    public static boolean checkIfFileExists(String name){
        try {
            BufferedReader br = new BufferedReader(new FileReader(name));
            br.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
