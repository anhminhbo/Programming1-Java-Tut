public class Exercise3 {
    public static Dog treatMeAsDog(Animal a){
        try {
            return (Dog)a;
        } catch (ClassCastException e){
            System.out.println("Impossible");
            return null;
        }
    }

    public static void main(String args[]){
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        treatMeAsDog(a2);
        //treatMeAsDog(a1);
    }
}
abstract class Animal {
    public abstract void makeSound();
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
