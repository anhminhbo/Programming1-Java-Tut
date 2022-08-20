import java.util.ArrayList;
import java.util.Comparator;

public class Tutorial8 {
  public static void main(String[] args) {
    Ingredient i1 = new Ingredient("Water", "ml");
    Ingredient i2 = new Ingredient("Salt", "mg");
    Ingredient i3 = new Ingredient("Sugar", "kg");
    Ingredient i4 = new Ingredient("Chicken", "g");
    RecipeComponent rc1 = new RecipeComponent(i1, 11.2);
    RecipeComponent rc2 = new RecipeComponent(i2, 23.2);
    RecipeComponent rc3 = new RecipeComponent(i3, 5.2);
    RecipeComponent rc4 = new RecipeComponent(i4, 2.3);
    RecipeDisplay recipeDisplay = new RecipeCasualDisplay();
    recipeDisplay.addComponent(rc1);
    recipeDisplay.addComponent(rc2);
    recipeDisplay.addComponent(rc3);
    recipeDisplay.addComponent(rc4);
    recipeDisplay.setSep(new DashSeparator());
    recipeDisplay.display();
    System.out.println();
    RecipeDisplay recipeDisplay1 = new RecipeSeriousDisplay();
    recipeDisplay1.addComponent(rc1);
    recipeDisplay1.addComponent(rc2);
    recipeDisplay1.addComponent(rc3);
    recipeDisplay1.addComponent(rc4);
    recipeDisplay1.setSep(new SpaceSeparator());
    recipeDisplay1.display();
    System.out.println();
    RecipeDisplay recipeDisplay2 = new RecipeHackerDisplay();
    recipeDisplay2.addComponent(rc1);
    recipeDisplay2.addComponent(rc2);
    recipeDisplay2.addComponent(rc3);
    recipeDisplay2.addComponent(rc4);
    recipeDisplay2.setSep(new BinarySeparator());
    recipeDisplay2.display();
  }
}

class RecipeDisplay {
  ArrayList<RecipeComponent> components;
  Separator sep;

  public RecipeDisplay() {
    components = new ArrayList<RecipeComponent>();
  }

  public void setSep(Separator sep) {
    this.sep = sep;
  }

  public void displaySeparator() {
    System.out.println(sep.getSeparator());
  }

  public void addComponent(RecipeComponent rc) {
    components.add(rc);
  }

  public void display() {
    System.out.println("I don't know how to display");
  }
}

class RecipeCasualDisplay extends RecipeDisplay {
  @Override
  public void display() {
    for (RecipeComponent rc : components) {
      System.out.println(rc);
      super.displaySeparator();
    }
  }
}

class RecipeSeriousDisplay extends RecipeDisplay {
  @Override
  public void display() {
    components.sort(new RecipeComponentByAmount());
    for (RecipeComponent rc : components) {
      System.out.println(rc);
      super.displaySeparator();
    }
  }
}

class RecipeHackerDisplay extends RecipeDisplay {
  @Override
  public void display() {
    components.sort(new RecipeComponentByDigits());
    for (RecipeComponent rc : components) {
      System.out.println(rc);
      super.displaySeparator();
    }
  }
}

class RecipeComponentByDigits implements Comparator<RecipeComponent> {
  @Override
  public int compare(RecipeComponent o1, RecipeComponent o2) {
    int length =
        Double.toString(o1.amount).length() < Double.toString(o2.amount).length()
            ? Integer.toString((int) o1.amount).length()
            : Integer.toString((int) o2.amount).length();
    for (int i = 1; i < length; i++) {
      int r1a = Integer.parseInt(Integer.toString((int) o1.amount).substring(0, i));
      int r2a = Integer.parseInt(Integer.toString((int) o2.amount).substring(0, i));
      if (r1a > r2a) {
        return 1;
      } else if (r1a < r2a) {
        return -1;
      }
    }
    return 0;
  }
}

class RecipeComponentByAmount implements Comparator<RecipeComponent> {
  @Override
  public int compare(RecipeComponent o1, RecipeComponent o2) {
    if (o1.amount > o2.amount) {
      return 1;
    }
    if (o1.amount < o2.amount) {
      return -1;
    }
    return 0;
  }
}

class Separator {
  public String getSeparator() {
    return "";
  }
}

class SpaceSeparator extends Separator {
  @Override
  public String getSeparator() {
    return " ";
  }
}

class DashSeparator extends Separator {
  @Override
  public String getSeparator() {
    return "-------";
  }
}

class BinarySeparator extends Separator {
  @Override
  public String getSeparator() {
    return "1010101010";
  }
}

class RecipeComponent {
  Ingredient ing;
  double amount;

  public RecipeComponent(Ingredient ing, double amount) {
    this.ing = ing;
    this.amount = amount;
  }

  public String toString() {
    return (ing.toString() + " - " + amount);
  }
}

class Ingredient {
  String name;
  String measurement;

  public Ingredient(String n, String m) {
    name = n;
    measurement = m;
  }

  public String toString() {
    return String.format("%s %s", name, measurement);
  }
}
