package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal{

    public void eat (Food food) {
        if (food instanceof Grass) {
            System.out.println("Herbivore eat " + food);
            full += food.getNutritionalValue();
        }
        else {
            System.out.println("This type of food doesn't fit for the Herbivore");
        }
    }
}
