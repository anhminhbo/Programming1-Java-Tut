package rmit.cosc2081.tutorial4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Ingredient> ingredientsList = new ArrayList<Ingredient>();
//
//        int exit = 0;
//
//        while (exit != 1){
//            System.out.println("Enter the ingredient name: ");
//            String name = scanner.next();
//            System.out.println("Enter the ingredient measurement unit: ");
//            String unit = scanner.next();
//            Ingredient ingredient = new Ingredient(name, unit);
//            ingredientsList.add(ingredient);
//            System.out.println("If you finish, please press 1, if not 0");
//            exit = scanner.nextInt();
//        }
//        displayIngredient(ingredientsList);
        Recipe r1 = new Recipe("first", 3);
        for (int i = 0; i < 3; i++) {
            r1.addComponent(i);
        }
        r1.display();
    }

    public static void displayIngredient(ArrayList<Ingredient> list) {
        for (Ingredient ingredient : list) {
            System.out.println(ingredient);
        }
    }
}
