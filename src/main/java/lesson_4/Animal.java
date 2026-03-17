package lesson_4;

public class Animal {
    private static int animalCount;
    private final String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
    }

    public void swim(int distance) {
    }
}
