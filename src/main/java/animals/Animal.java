package animals;

import food.Food;

public abstract class Animal {
    protected int full;

    public abstract void eat (Food food);

    public void getFullness() {
        System.out.println("Fullness: " + full +"\n");
    }


}
