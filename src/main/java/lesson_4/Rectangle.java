package lesson_4;

public class Rectangle implements Shape {
    private final double a;
    private final double b;
    private final String fillColor;
    private final String borderColor;

    public Rectangle(double a, double b, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
