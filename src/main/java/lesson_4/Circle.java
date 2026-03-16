package lesson_4;

public class Circle implements Shape {
    private final double r;
    private final String fillColor;
    private final String borderColor;

    public Circle(double r, String fillColor, String borderColor) {
        this.r = r;
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
    public double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * r * 2;
    }
}
