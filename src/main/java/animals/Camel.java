package animals;

import food.Food;

public class Camel extends Herbivore implements Voice, Run {

    @Override
    public String toString() {
        return "Camel";
    }

    @Override
    public void eat(Food food) {
        System.out.println("Camel eat " + food.toString());
        super.eat(food);
    }

    @Override
    public void run() {
        System.out.println("Camel is running");

    }

    @Override
    public String voice() {
        return "Camel is yelling";
    }
}
