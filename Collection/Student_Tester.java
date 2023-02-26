package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester3 {
    public static Set<Student> findUnique(List<Student> students) {
        Set<Student> uniqueStudents = new HashSet<>();
        for (Student student : students) {
            uniqueStudents.add(student);
        }
        return uniqueStudents;
    }

    public static Set<Student> findDuplicates(List<Student> students) {
        Set<Student> danceStudents = new HashSet<>();
        Set<Student> musicStudents = new HashSet<>();
        Set<Student> duplicates = new HashSet<>();

        for (Student student : students) {
            if (student.getEvent().equals("Dance")) {
                if (musicStudents.contains(student)) {
                    duplicates.add(student);
                } else {
                    danceStudents.add(student);
                }
            } else if (student.getEvent().equals("Music")) {
                if (danceStudents.contains(student)) {
                    duplicates.add(student);
                } else {
                    musicStudents.add(student);
                }
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student(5004, "Wyatt", "Wyatt@example.com","Dance"));
        students.add(new Student(5010, "Lucy", "Lucy@example.com","Dance"));
        students.add(new Student(5550, "Aaron", "Aaron@example.com","Dance"));
        students.add(new Student(5560, "Ruby", "Ruby@example.com","Dance"));
        students.add(new Student(5015, "Sophie", "Sophie@example.com","Music"));
        students.add(new Student(5013, "Clara", "Clara@example.com","Music"));
        students.add(new Student(5010, "Lucy", "Lucy@example.com","Music"));
        students.add(new Student(5011, "Ivan", "Ivan@example.com","Music"));
        students.add(new Student(5550, "Aaron", "Aaron@example.com","Music"));

        Set<Student> studentNominations = findUnique(students);
        System.out.println("Students who have submitted nominations");
        for(Student student: studentNominations)
            System.out.println(student);

        Set<Student> duplicateStudents = findDuplicates(students);
        System.out.println("Students who have submitted nominations for both the events");
        for(Student student: duplicateStudents)
            System.out.println(student);
    }
}


	