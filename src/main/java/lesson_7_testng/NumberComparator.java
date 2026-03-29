package lesson_7_testng;

public class NumberComparator {
    private int a;
    private int b;

    public NumberComparator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean isEqual() {
        return a == b;
    }
}
