// Implement two classes Instructor and Student which inherits the User class

// Instructor: Add fields like qualification, coursesTaught, salary etc.
// Student: Add fields like registeredCourses, grade, joiningYear etc.
// Implement constructors for both classes
// Implement constuctor that utilizes super keyword
// Instantiate objects for both Instructor and Student class using above constructors

import java.lang.reflect.Method;

class Instructor extends User2 {
    String qualification;
    String courseTaught;
    double salary;

    public Instructor(String firstName, String lastName, String email, String qualification, String courseTaught,
            double salary) {
        super(firstName, lastName, email); // call to parent constructor
        this.qualification = qualification;
        this.courseTaught = courseTaught;
        this.salary = salary;
    }

    // incrementSalary with int percent as parameter and increment the salary by
    // percentage
    // incrementSalary with int percent and int bonus as parameters, and increment
    // the salary
    // by percentage and then add the bonus to salary
    public void incrementSalary(int percent) {
        double increment = salary * percent / 100.0;
        this.salary += increment;
    }

    public void incrementSalary(int percent, int bonus) {
        double increment = salary * percent / 100.0;
        this.salary += increment + bonus;
    }
    // In Java, the child class can also have the same
    // method as the parent class. This is known as Method
    // Overriding. Add the following method to the Instructor class:

    // getFullname() method which returns the full
    // name of the Instuctor along with a prefix "Prof."
    // (i.e Prof. Firstname Lastname). This method overrides the
    // getFullname method defined of the User class
    @Override
    public String getFullname() {
        return "Prof. " + super.getFirstName() + " " + super.getLastName();
    }

}
