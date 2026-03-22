package lesson_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> contacts = new HashMap<>();

    public void add(String surname, String phone) {
        if (!contacts.containsKey(surname)) {
            contacts.put(surname, new ArrayList<>());
        }
        contacts.get(surname).add(phone);
    }

    public List<String> get(String surname) {
        return contacts.get(surname);
    }
}
