import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {
    public void feed (Animal animal, Food food) {
        animal.eat(food);
        System.out.println("The worker feed " + animal + "\n");
    }
    public void getVoice (Voice animal) {
        System.out.println(animal.voice());
    }
}
