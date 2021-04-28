package animals;

import food.Food;

public class Fox extends Carnivorous implements Voice, Run {

    @Override
    public String toString(){
        return "Fox";
    }
    @Override
    public void run(){
        System.out.println("Fox is running");
    }
    @Override
    public String voice(){
        return "Fox is yapping";
    }
    public void eat(Food food){
        System.out.println("The fox was given " + food.toString());
        super.eat(food);
    }
}
