import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Array to hold the student objects
        Student[] students = new Student[n];

        // Read the details of each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            
            System.out.print("USN: ");
            String usn = scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Branch: ");
            String branch = scanner.nextLine();
            
            System.out.print("Phone: ");
            String phone = scanner.nextLine();
            
            // Create a new student object and add it to the array
            students[i] = new Student(usn, name, branch, phone);
        }

        // Print the student details with suitable headings
        System.out.printf("%-15s %-20s %-15s %-15s%n", "USN", "Name", "Branch", "Phone");
        System.out.println("--------------------------------------------------------------------------");
        for (Student student : students) {
            System.out.printf("%-15s %-20s %-15s %-15s%n", student.getUsn(), student.getName(), student.getBranch(), student.getPhone());
        }

        scanner.close();
    }
}
