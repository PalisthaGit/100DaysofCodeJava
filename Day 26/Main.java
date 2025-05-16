public class Main {
    public static void main(String[] args) {
        User1 u1 = new User1("Helo", "Sdf");
        User1 u2 = new User1("helo@example.com");
        User1 u3 = new User1("Helo", "Sdf", "helo@example.com");

        System.out.println("User1: " + u1.getFullname());
        System.out.println("User2 email: " + u2.getEmail());
        System.out.println("User3 full info: " + u3.getFullname() + ", Email: " + u3.getEmail());
    }
}
