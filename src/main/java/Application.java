import model.Kotik;

public class Application {

        public static void main(String[] args) {

            Kotik cat1 = new Kotik(5, "Barsik", "meow", 2, 3);
            Kotik cat2 = new Kotik();
            cat2.setKotik(8,"Busya", 3, "meeeow");
            cat1.liveAnotherDay();

            System.out.println("Cat name: " + cat1.getName() );
            System.out.println("Cat weight: " + cat1.getWeight());

            String compareMeow = cat1.getMeow().equals(cat2.getMeow()) ? "Cats meowing same" : "Cats meowing different" + "\n";
            System.out.println(compareMeow);

            System.out.println("Cat count: " + Kotik.getCatCount());
        }
    }
