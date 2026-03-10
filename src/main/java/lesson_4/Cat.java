package lesson_4;

public class Cat extends Animal{
    static int catCount=0;
    boolean isFull = false;
    public Cat(String name){
        super(name);
        catCount++;
    }
    @Override
    public void run(int distance) {
        if(distance<=200){
            System.out.println(name + " пробежал " + distance + " метров.");
        }
        else{
            System.out.println(name + " не может столько пробежать.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void feedFrom(Bowl bowl, double amount) {
        boolean success = bowl.eat(amount);
        if (success) {
            isFull = true;
        }
    }
}
