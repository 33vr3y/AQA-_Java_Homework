package lesson_4;

public class Cat extends Animal {
    private static int catCount;
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " пробежал " + distance + " метров.");
        } else {
            System.out.println(getName() + " не может столько пробежать.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать.");
    }

    public void feedFrom(Bowl bowl, double amount) {
        boolean success = bowl.takeFood(amount);
        if (success) {
            isFull = true;
        }
    }
}
