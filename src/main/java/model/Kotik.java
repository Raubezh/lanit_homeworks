package model;

public class Kotik {
    private static int catCount = 0;

    public static int getCatCount() {
        return catCount;
    }

    public static int count = 1;

    private int full;
    private String name;
    private String meow;
    private int weight;
    private int prettiness;

    public Kotik() {
        catCount++;
    }

    public Kotik(int prettiness, String name, String meow, int weight, int full) {
        this.prettiness += prettiness;
        this.name = name;
        this.meow = meow;
        this.weight = weight;
        this.full = full;
        catCount++;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness += prettiness;
        full = 5;
        this.name = name;
        this.meow = meow;
        this.weight = weight;
    }

    public int getPrettiness() {
        return prettiness;
    }
    public int getFull() {
        return full;
    }
    public String getName() {
        return name;
    }
    public String getMeow() {
        return meow;
    }
    public int getWeight() {
        return weight;
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            int random = 1 + (int) (Math.random() * 5);
            System.out.println(count++);
            if (full <= 0) {
                System.out.println("Cat is hungry");
                switch (random) {
                    case 1:
                        eat(4, "fish");
                        break;
                    case 2:
                        eat(2);
                        break;
                    case 3:
                        eat(6, "beef");
                        break;
                    case 4:
                        eat(5, "Sheba");
                        break;
                    default:
                        eat();
                }
            }
            switch (random) {
                case 1:
                    play();
                    break;
                case 2:
                    eat();
                    break;
                case 3:
                    sleep();
                    break;
                case 4:
                    chaseMouse();
                    break;
                default:
                    washing();
            }
        }
    }

    private void eat(int nutritionFacts) {
        full += nutritionFacts;
        System.out.println("Cat eating " + "\nFullness: " + full + "\n");
    }

    private void eat(int nutritionFacts, String food) {
        full += nutritionFacts;
        System.out.println("Cat eating " + food + "\nFullness: " + nutritionFacts + "\n");
    }

    private void eat() {
        eat(5, "meat");
    }

    private boolean play() {
        if (full < 0) {
            return false;
        } else {
            full -= 3;
            System.out.println("Cat playing");
            System.out.println("Fullness: " + full + "\n");
            return true;
        }
    }

    private boolean sleep() {
        if (full < 0) {
            return false;
        } else {
            full -= 2;
            System.out.println("Cat sleeping");
            System.out.println("Fullness: " + full + "\n");
            return true;
        }
    }

    private boolean chaseMouse() {
        if (full < 0) {
            return false;
        } else {
            full -= 3;
            System.out.println("Cat chasing mouse");
            System.out.println("Fullness: " + full + "\n");
            return true;
        }
    }

    private boolean washing() {
        if (full < 0) {
            return false;
        } else {
            full -= 1;
            System.out.println("Cat is washing");
            System.out.println("Fullness: " + full + "\n");
            return true;
        }
    }
}
