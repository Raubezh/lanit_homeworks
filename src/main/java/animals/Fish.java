package animals;

import food.Food;

public class Fish extends Carnivorous implements Swim {

    @Override
    public void swim(){
        System.out.println("Fish is swimming");
    }

    @Override
    public void eat(Food food){
        System.out.println("The fish was given " + food.toString());
        super.eat(food);
    }
}
