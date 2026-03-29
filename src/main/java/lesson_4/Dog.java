package lesson_4;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(getName() + " пробежал " + distance + " метров.");
        } else {
            System.out.println(getName() + " не может столько пробежать.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(getName() + " проплыл " + distance + " метров.");
        } else {
            System.out.println(getName() + " не может столько проплыть.");
        }
    }
}
