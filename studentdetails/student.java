public class Student {
    // Variables to hold student details
    private String usn;
    private String name;
    private String branch;
    private String phone;

    // Constructor to initialize a student object
    public Student(String usn, String name, String branch, String phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    // Getter methods to access the student details
    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getPhone() {
        return phone;
    }
}
