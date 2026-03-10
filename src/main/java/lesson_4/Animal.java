package lesson_4;

public class Animal {
    static int animalCount = 0;
    String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
    }

    public void swim(int distance) {
    }
}
