package animals;

import food.Food;

public class Duck extends Herbivore implements Fly, Swim, Voice, Run {

    @Override
    public String toString() {
        return "Duck";
    }

    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public String voice(){
        return "Duck quacks";
    }

    @Override
    public void swim(){
        System.out.println("Duck is swimming");
    }

    @Override
    public void fly(){
        System.out.println("Duck is flying");
    }

    @Override
    public void eat(Food food){
        System.out.println("The duck was given " + food.toString());
        super.eat(food);
    }
}
