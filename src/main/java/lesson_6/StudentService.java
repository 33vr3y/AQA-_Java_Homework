package lesson_6;

import java.util.List;
import java.util.Iterator;

public class StudentService {
    public void removeStudent(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            }
        }
    }

    public void promoteStudent(List<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public void printStudents(List<Student> students, int course){
        for(Student student : students){
            if(student.getCourse()==course){
                System.out.println(student.getName());
            }
        }
    }

}
