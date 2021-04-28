import animals.Animal;
import animals.*;
import food.*;
import org.omg.CORBA.ShortSeqHelper;

public class Zoo {
    public static void main(String[] args) {
        Animal camel = new Camel();
        Animal duck = new Duck();
        Animal horse = new Horse();
        Animal fish = new Fish();
        Animal fox = new Fox();
        Animal coyote = new Coyote();


        Food hay = new Hay();
        Food beef = new Beef();
        Food poultryMeat = new PoultryMeat();
        Food oats = new Oats();


        Worker worker = new Worker();

        worker.feed(camel, beef);
        worker.feed(camel, hay);
        worker.feed(duck, hay);
        worker.feed(duck, oats);
        worker.feed(horse, beef);
        worker.feed(horse, oats);
        worker.feed(fox, hay);
        worker.feed(fox, poultryMeat);
        worker.feed(fish, beef);
        worker.feed(fish, hay);
        worker.feed(coyote, beef);
        worker.feed(coyote, oats);

        worker.feed(camel,hay);
        camel.getFullness();
        worker.feed(camel, hay);
        camel.getFullness();

        Animal[] lake = {duck, fish};
        for (Animal animal: lake){
            Swim swimer = (Swim) animal;
            swimer.swim();
        }



    }

}
