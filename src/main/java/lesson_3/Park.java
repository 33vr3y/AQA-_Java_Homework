package lesson_3;

public class Park {
private String name;
private Address address;
private String time;

    public Park(String name, Address address, String time) {
        this.name = name;
        this.address = address;
        this.time = time;
    }

    static class Attraction{
        String attractionName;
        String attractionTime;
        double attractionCost;

        public Attraction(String attractionName, String  attractionTime, double attractionCost){
            this.attractionName = attractionName;
            this.attractionTime = attractionTime;
            this.attractionCost = attractionCost;
        }

        public void attractionInfo(){
            System.out.println("Название аттракциона: " + attractionName);
            System.out.println("Время работы аттракциона: " + attractionTime);
            System.out.println("Стоимость аттракциона: " + attractionCost);
            System.out.println("==================");
        }
    }

    static class Address{
        String city;
        String street;
        String number;

        public Address(String city, String street, String number) {
            this.city = city;
            this.street = street;
            this.number = number;
        }
    }

    public void parkInfo(Address address) {
        System.out.println("Название парка: " + name);
        System.out.println("Город: " + address.city);
        System.out.println("Улица: " + address.street);
        System.out.println("Номер дома: " + address.number);
        System.out.println("Время работы: " + time);
    }
}
