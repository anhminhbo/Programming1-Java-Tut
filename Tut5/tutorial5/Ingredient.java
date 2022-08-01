package rmit.cosc2081.tutorial5;

import java.util.Scanner;

public class Ingredient {
    private String name;
    private String measurementUnit;

    // Ex3
    private String comment;
    public Ingredient(String name, String measurementUnit, String comment){
        this.name = name;
        this.measurementUnit = measurementUnit;
        this.comment = comment;
    }

    // Ex1
    // A generator of our ingredients. Whenever there is an update in the data fields of the Ingredient
    // class, we will modify this method accordingly.
    public static Ingredient createIngredient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the name of the ingredient: ");
        String name = scanner.nextLine();
        System.out.println("Please input the measurement of the ingredient: ");
        String measurementUnit = scanner.nextLine();

        // Ex3
        System.out.println("Please input the comment of the ingredient: ");
        String comment = scanner.nextLine();
        // == compare the reference
        // .equals compare the content
        if (comment.equals("")){
            comment = "No comment";
        }
        return new Ingredient(name, measurementUnit, comment);
    }

    // Ex1
    public void displayIngredient(){
        System.out.printf("The ingredient is: %s and the measurement unit is: %s and the comment is: %s\n",
        name, measurementUnit, comment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        // We prevent the outsiders from modifying the unit of our ingredient with invalid units
        // This is how we encapsulate our data fields (make them private and provide getters/setters)
        String[] availableUnits = {"teaspoon", "spoon", "mg"};
        boolean matched = false;
        for (String unit: availableUnits){
            if (measurementUnit.equals(unit)){
                matched = true;
            }
        }
        if (matched)
            this.measurementUnit = measurementUnit;
        else
            System.out.println("Error unit");
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
