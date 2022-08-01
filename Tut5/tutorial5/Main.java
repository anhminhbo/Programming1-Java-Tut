package rmit.cosc2081.tutorial5;

public class Main {

    public static void main(String args[]){

        // Ex2
//        Ingredient i1 = Ingredient.createIngredient();
//        i1.displayIngredient();
//        Ingredient i2 = Ingredient.createIngredient();
//        i2.displayIngredient();


        //Ex4
        Recipe recipe1 = new Recipe("scone", 3);
        for (int i = 0; i < recipe1.getNumber(); i++)
            recipe1.addComponent(i);

        recipe1.displayRecipe();
        System.out.println("Number of recipes is: " + Recipe.getTotalRecipe());

        Recipe recipe2 = new Recipe("scone2", 2);
        for (int i = 0; i < recipe2.getNumber(); i++)
            recipe2.addComponent(i);

        recipe2.displayRecipe();
        System.out.println("Number of recipes is: " + Recipe.getTotalRecipe());
    }
}
