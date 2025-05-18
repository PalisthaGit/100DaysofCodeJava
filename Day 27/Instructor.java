// Implement two classes Instructor and Student which inherits the User class

// Instructor: Add fields like qualification, coursesTaught, salary etc.
// Student: Add fields like registeredCourses, grade, joiningYear etc.
// Implement constructors for both classes
// Implement constuctor that utilizes super keyword
// Instantiate objects for both Instructor and Student class using above constructors

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

}
