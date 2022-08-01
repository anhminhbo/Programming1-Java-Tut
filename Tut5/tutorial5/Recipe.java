package rmit.cosc2081.tutorial5;

import java.util.HashSet;

public class Recipe {
    private String name;

    // We can choose different data structures to keep our RecipeComponent objects: array, list, or set.
    // private RecipeComponent[] listComponent;
    private HashSet<RecipeComponent> components;

    // Number of components in a recipe. However, we do not really need this variable to keep track.
    // There are another way to retrieve its value.
    private int number;
    private static int totalRecipe = 0; // Ex4

    public Recipe (String name, int number){
        this.name = name;
        this.number = number;
        //listComponent = new RecipeComponent[number];
        this.components = new HashSet<RecipeComponent>();
        totalRecipe++;
    }

    // The idx (index) is optional when the data structure used is array
    public void addComponent(int idx){
        // We have two generators in Ingredient and RecipeComponent to handle the logic of taking
        // the inputs from the user, that is the reason why the commented-out part is no longer necessary.
        // This also facilitates the Single-responsibility principle
        System.out.println("Adding new component....");
        components.add(RecipeComponent.createRecipeComponent());
        /*
        System.out.println("Adding new component...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ingredient name: ");
        String name = scanner.nextLine();
        System.out.println("Enter measurement unit: ");
        String unit = scanner.nextLine();
        System.out.println("Enter the amount: ");
        float amount = Float.parseFloat(scanner.nextLine());
        listComponent[idx] = new RecipeComponent(new Ingredient(name,unit), amount);
         */
    }

    public void displayRecipe(){
        System.out.println(name + " (Recipe)");
        for(RecipeComponent rp: components){
            rp.displayRecipeComponent();
            System.out.println("------------");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getTotalRecipe() {
        return totalRecipe;
    }

}
