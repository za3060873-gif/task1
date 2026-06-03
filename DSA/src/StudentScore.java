import java.util.Map;
import java.util.TreeMap;

public class StudentScore{

    private TreeMap<String, Integer> studentScores;
    public StudentScore() {
        studentScores = new TreeMap<>();
    }
    public void addOrUpdateScore(String name, int score) {
        studentScores.put(name, score);
        System.out.println("Score updated for " + name + ": " + score);
    }
    public void removeStudent(String name) {
        if (studentScores.remove(name) != null) {
            System.out.println(name + " removed successfully.");
        } else {
            System.out.println(name + " not found.");
        }
    }
    public Integer getScore(String name) {
        return studentScores.get(name);
    }

    public void displayAllStudents() {
        if (studentScores.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }
        System.out.println("Student Records:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public void displayStudentsInRange(String start, String end) {
        System.out.println("Students between " + start + " and " + end + ":");

        for (Map.Entry<String, Integer> entry :
                studentScores.subMap(start, true, end, true).entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void main(String[] args) {

        StudentScore manager = new StudentScore();
        manager.addOrUpdateScore("Ali", 85);
        manager.addOrUpdateScore("Ahmed", 90);
        manager.addOrUpdateScore("Bilal", 78);
        manager.addOrUpdateScore("Zain", 95);
        manager.addOrUpdateScore("Sara", 88);

        System.out.println("\nAll Students:");
        manager.displayAllStudents();

        System.out.println("\nScore of Bilal:");
        System.out.println(manager.getScore("Bilal"));

        System.out.println("\nStudents in Range (A to S):");
        manager.displayStudentsInRange("A", "S");

        System.out.println("\nRemoving Ahmed:");
        manager.removeStudent("Ahmed");

        System.out.println("\nUpdated Student List:");
        manager.displayAllStudents();
    }
}