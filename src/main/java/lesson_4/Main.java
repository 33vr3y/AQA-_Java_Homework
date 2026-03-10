package lesson_4;

public class Main {
    static void main(String[] args) {
        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Барсик");
        catsArray[1] = new Cat("Подик");
        catsArray[2] = new Cat("Шлёпа");
        catsArray[3] = new Cat("Клоун");
        catsArray[4] = new Cat("Дошик");
        Bowl bowl = new Bowl(50);
        bowl.addFood(30);
        for(int i=0; i<5; i++){
            catsArray[i].feedFrom(bowl, 15);
            System.out.println(catsArray[i].name + " - " + (catsArray[i].isFull ? "Сыт" : "Голоден"));
        }
        Dog dog = new Dog("Бобик");
        dog.run(500);
        Cat cat = new Cat("Жижа");
        cat.run(200);
    }
}
