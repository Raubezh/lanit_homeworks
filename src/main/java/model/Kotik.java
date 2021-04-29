package model;

public class Kotik {
    private int satiety;
    private String name;
    private String meow;
    private int weight;
    private int prettiness;

    private static int catCount = 0;

    public static int getCatCount() {
        return catCount;
    }

    public Kotik() {
        catCount++;
    }

    public Kotik(int prettiness, String name, String meow, int weight, int satiety) {
        this.prettiness += prettiness;
        this.name = name;
        this.meow = meow;
        this.weight = weight;
        this.satiety = satiety;
        catCount++;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness += prettiness;
        satiety = 5;
        this.name = name;
        this.meow = meow;
        this.weight = weight;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getSatiety() {
        return satiety;
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
        for (int i = 1; i < 25; i++) {
            int random = 1 + (int) (Math.random() * 5);
            System.out.println(i);
            if (getSatiety() <= 0) {
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
            } else {
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
    }

    private void eat(int nutritionFacts) {
        satiety += nutritionFacts;
        System.out.println("Cat eating " + "\nFullness: " + satiety + "\n");
    }

    private void eat(int nutritionFacts, String food) {
        satiety += nutritionFacts;
        System.out.println("Cat eating " + food + "\nFullness: " + nutritionFacts + "\n");
    }

    private void eat() {
        eat(5, "meat");
    }

    private boolean play() {
        if (satiety < 0) {
            return false;
        }
        satiety -= 3;
        System.out.println("Cat playing");
        System.out.println("Fullness: " + satiety + "\n");
        return true;
    }

    private boolean sleep() {
        if (satiety <= 0) {
            return false;
        }
        satiety -= 2;
        System.out.println("Cat sleeping");
        System.out.println("Fullness: " + satiety + "\n");
        return true;
    }

    private boolean chaseMouse() {
        if (satiety <= 0) {
            return false;
        }
        satiety -= 3;
        System.out.println("Cat chasing mouse");
        System.out.println("Fullness: " + satiety + "\n");
        return true;
    }

    private boolean washing() {
        if (satiety <= 0) {
            return false;
        }
        satiety -= 1;
        System.out.println("Cat is washing");
        System.out.println("Fullness: " + satiety + "\n");
        return true;
    }
}

