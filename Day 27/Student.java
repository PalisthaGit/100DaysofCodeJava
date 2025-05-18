// Instructor: Add fields like qualification, coursesTaught, salary etc.
// Student: Add fields like registeredCourses, grade, joiningYear etc.
// Implement constructors for both classes
// Implement constuctor that utilizes super keyword
// Instantiate objects for both Instructor and Student class using above constructors

public class Student extends User2 {
    String registeredCourses;
    char grade;
    int joiningYear;

    public Student(String firstName, String lastName, String email, String registeredCourses, char grade,
            int joiningYear) {
        super(firstName, lastName, email); // Initialize inherited fields
        this.registeredCourses = registeredCourses;
        this.grade = grade;
        this.joiningYear = joiningYear;
    }

}
