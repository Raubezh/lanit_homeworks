package animals;

import food.Food;

public class Coyote extends Carnivorous implements Voice,Run {
    @Override
    public String toString(){
        return "Coyote";
    }
    @Override
    public void run(){
        System.out.println("Coyote is running");
    }
    @Override
    public String voice(){
        return "Coyote is howling";
    }
    public void eat(Food food){
        System.out.println("The coyote was given " + food.toString());
        super.eat(food);
    }
}
