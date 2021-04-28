package animals;

import food.Food;

public class Horse extends Herbivore implements Voice, Run {

    @Override
    public String toString(){
        return "Horse";
    }
    @Override
    public void run(){
        System.out.println("Horse is running");
    }

    @Override
    public String voice(){
        return "Horse is laughs";
    }
    public void eat(Food food){
        System.out.println("The horse was given " + food.toString());
        super.eat(food);
    }



}
