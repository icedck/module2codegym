import animal.Animal;
import animal.Tiger;
import animal.Chicken;
import edible.Edible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for (Animal a : animal) {
            System.out.println(a.makeSound());

            if (a instanceof Chicken) {
                Edible edibler = (Chicken) a;
                System.out.println(edibler.howToEat());
            }
        }


        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit f : fruit) {
            System.out.println(f.howToEat());
        }
    }
}
