// Instructor: Add fields like qualification, coursesTaught, salary etc.
// Student: Add fields like registeredCourses, grade, joiningYear etc.
// Implement constructors for both classes
// Implement constuctor that utilizes super keyword
// Instantiate objects for both Instructor and Student class using above constructors

public class Main {
    public static void main(String[] args) {
        Instructor i = new Instructor("phd", "math", "sd", "sdf", "sf", 233);
        Student s1 = new Student("sdf", "asdf", "asf", "asf", 'd', 2323);

        System.out.println(s1.registeredCourses);
        System.out.println(i.courseTaught);

    }
}
