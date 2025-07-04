public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hieu dep zai!!!");
        User user = new User("Phan Trong Hieu", "hieudzvcl@gmail.com", "hieune1203");
        System.out.println(user);

        user.setName("Hieu dep traiaaia");
        user.setEmail("hieune@gmail.com");

        System.out.println("Updated user info:");
        System.out.println(user);
    }
}
