package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Иванов", 1, 1, List.of(4, 5, 3, 4)));
        students.add(new Student("Петров", 1, 2, List.of(2, 3, 2, 1)));
        students.add(new Student("Сидоров", 2, 1, List.of(5, 5, 4, 5)));
        students.add(new Student("Козлов", 2, 3, List.of(3, 3, 3, 3)));
        students.add(new Student("Смирнов", 3, 2, List.of(2, 2, 1, 2)));
        students.add(new Student("Новиков", 3, 1, List.of(4, 4, 5, 3)));
        students.add(new Student("Морозов", 1, 3,List.of(5, 4, 4, 5)));
        students.add(new Student("Волков", 2, 2, List.of(2, 3, 2, 2)));
        students.add(new Student("Лебедев", 3, 1, List.of(3, 4, 3, 4)));
        students.add(new Student("Соколов", 1, 2, List.of(5, 5, 5, 4)));
        StudentService service = new StudentService();
        System.out.println("Студенты 2 курса до повышения:");
        service.printStudents(students, 2);

        service.removeStudent(students);
        service.promoteStudent(students);

        System.out.println("Студенты 2 курса после повышения:");
        service.printStudents(students, 3);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "89001234567");
        phoneBook.add("Иванов", "89007654321");
        phoneBook.add("Петров", "89009999999");
        phoneBook.add("Сидоров", "89001111111");
        phoneBook.add("Сидоров", "89002222222");
        phoneBook.add("Козлов", "89003333333");
        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Петров"));
    }
}
