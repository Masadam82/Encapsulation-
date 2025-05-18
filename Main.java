import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Student
        System.out.print("Masukkan nama mahasiswa: ");
        String studentName = scanner.nextLine();
        System.out.print("Masukkan alamat mahasiswa: ");
        String studentAddress = scanner.nextLine();
        Student student = new Student(studentName, studentAddress);

        System.out.print("Berapa mata kuliah yang diambil? ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nama mata kuliah " + (i + 1) + ": ");
            String course = scanner.nextLine();
            System.out.print("Nilai untuk " + course + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine();
            student.addCourseGrade(course, grade);
        }

        // Tampilkan data mahasiswa
        System.out.println(student);
        student.printGrades();
        System.out.println("Rata-rata nilai: " + student.getAverageGrade());

        // Input Teacher
        System.out.print("\nMasukkan nama dosen: ");
        String teacherName = scanner.nextLine();
        System.out.print("Masukkan alamat dosen: ");
        String teacherAddress = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAddress);

        System.out.print("Berapa mata kuliah yang diajar? ");
        int jumlahAjars = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < jumlahAjars; i++) {
            System.out.print("Nama mata kuliah " + (i + 1) + ": ");
            String course = scanner.nextLine();
            if (teacher.addCourse(course)) {
                System.out.println("Mata kuliah berhasil ditambahkan.");
            } else {
                System.out.println("Mata kuliah sudah ada.");
            }
        }

        System.out.println(teacher);

        scanner.close();
    }
}
