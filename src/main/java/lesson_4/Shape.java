package lesson_4;

public interface Shape {
    default double calculatePerimeter(){
        return 0;
    }

    double calculateArea();
}
