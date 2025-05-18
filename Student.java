import java.util.Arrays;

public class Student extends Person {
    private int numCourses = 0;
    private String[] courses = new String[30];
    private int[] grades = new int[30];

    public Student(String name, String address) {
        super(name, address);
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public double getAverageGrade() {
        int total = 0;
        for (int i = 0; i < numCourses; i++) {
            total += grades[i];
        }
        return numCourses > 0 ? (double) total / numCourses : 0;
    }

    public String toString() {
        return "Student: " + super.toString();
    }
}
