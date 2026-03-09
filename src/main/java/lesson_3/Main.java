package lesson_3;

public class Main {
    static void main(String[] args) {
        Products[] productsArray = new Products[5];
        productsArray[0] = new Products("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Products("iPhone 15 Pro", "15.03.2025", "Apple Inc.", "China", 4999, false);
        productsArray[2] = new Products("Xiaomi 13T Pro", "10.04.2025", "Xiaomi Corp.", "China", 3299, true);
        productsArray[3] = new Products("Google Pixel 8", "20.05.2025", "Google LLC", "Vietnam", 4199, false);
        productsArray[4] = new Products("OnePlus 12", "01.06.2025", "OnePlus Technology", "China", 3699, false);

        for (int i=0; i<5;i++){
            productsArray[i].printInfo();
        }

        Park.Address address = new Park.Address("Москва", "Парковая", "15");
        Park park = new Park("FunZone", address, "9:00-22:00");
        park.parkInfo(address);

        Park.Attraction[] attractions = new Park.Attraction[4];
        attractions[0] = new Park.Attraction("Американские горки", "10:00-20:00", 250);
        attractions[1] = new Park.Attraction("Колесо обозрения", "9:00-22:00", 130);
        attractions[2] = new Park.Attraction("Комната страха", "9:30-21:00", 190);
        attractions[3] = new Park.Attraction("Автодром", "9:30-21:30", 150);
        for (int j=0; j<4; j++){
            attractions[j].attractionInfo();
        }
    }
}
