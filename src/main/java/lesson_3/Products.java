package lesson_3;

public class Products {
    private String name;
    private String date;
    private String manufacturer;
    private String country;
    private double cost;
    private boolean bookingStatus;

    public Products(String name, String date, String manufacturer, String country, double cost, boolean bookingStatus) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.cost = cost;
        this.bookingStatus = bookingStatus;
    }

    public void printInfo() {
        System.out.println("Название: " + name + " | Дата: " + date +
                " | Производитель: " + manufacturer);
        System.out.println("Страна производства: " + country);
        System.out.println("Цена: " + cost);
        System.out.println("Статус: " + (bookingStatus ? "Забронирован" : "Свободен"));
    }
}
