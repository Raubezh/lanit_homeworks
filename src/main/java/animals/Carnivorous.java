package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {

    public void eat (Food food) {
        if (food instanceof Meat) {
            System.out.println("Carnivorous eat " + food);
            full += food.getNutritionalValue();
        }
        else {
            System.out.println("This type of food doesn't fit for the Carnivorous");
        }
    }
}
