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

        for (int i = 0; i < 5; i++) {
            catsArray[i].feedFrom(bowl, 20);
            System.out.println(catsArray[i].getName() + " - " + (catsArray[i].isFull() ? "Сыт" : "Голоден"));
        }

        Dog dog = new Dog("Бобик");
        dog.run(500);
        Cat cat = new Cat("Жижа");
        cat.run(200);
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Собак: " + Dog.getDogCount());

        Rectangle rec = new Rectangle(15, 9, "Red", "Black");
        System.out.println("Прямоугольник");
        System.out.println("Площадь: " + rec.calculateArea());
        System.out.println("Периметр: " + rec.calculatePerimeter());
        System.out.println("Цвет заливки: " + rec.getFillColor());
        System.out.println("Цвет границ: " + rec.getBorderColor());

        Triangle triangle = new Triangle(5.5, 4, 2.1, "Green", "Black");
        System.out.println("Треугольник");
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Периметр: " + triangle.calculatePerimeter());
        System.out.println("Цвет заливки: " + triangle.getFillColor());
        System.out.println("Цвет границ: " + triangle.getBorderColor());

        Circle circle = new Circle(7, "Blue", "Black");
        System.out.println("Круг");
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Периметр: " + circle.calculatePerimeter());
        System.out.println("Цвет заливки: " + circle.getFillColor());
        System.out.println("Цвет границ: " + circle.getBorderColor());
    }
}