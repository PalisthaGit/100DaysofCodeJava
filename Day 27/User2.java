// Day 26: Constructors
// Implement multiple constructors for the User class:

// With parameters (firstname, lastname)
// With parameters (email)
// With parameters (firstname, lastname, email)
// Instantiate objects of User class using above constructors

public class User2 {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    private String city;
    private String country;

    public User2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User2(String email) {
        this.email = email;
    }

    public User2(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public User2(int id, String firstName, String lastName, String email, String city, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.country = country;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void getEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFullname() {
        return this.firstName + " " + this.lastName;
    }
}