package Question4;

import java.util.HashMap;
import java.util.Map;

public class studentgrades {
    private Map<String, Integer> grades = new HashMap<>();

    public void addStudent(String name, int grade) {
        grades.put(name, grade);
        System.out.println("Student added: " + name);
    }

    public void removeStudent(String name) {
        grades.remove(name);
        System.out.println("Student removed: " + name);
    }

    public void displayGrade(String name) {
        Integer grade = grades.get(name);
        if (grade != null) {
            System.out.println("Grade of " + name + ": " + grade);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public static void main(String[] args) {
        studentgrades sg = new studentgrades();
        sg.addStudent("Alice", 90);
        sg.addStudent("Bob", 85);

        sg.displayGrade("Alice");
        sg.displayGrade("Bob");

        sg.removeStudent("Alice");
        sg.displayGrade("Alice");
    }
}

