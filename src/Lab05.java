import java.time.LocalDate;

public class Lab05 {
    public static void main(String[] args) {
        // --- Previous Lab Tests ---
        User john = new User("John", 1954, 2, 18);
        System.out.println(john.getInfo());

        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        System.out.println(nicolas.getInfo());

        System.out.println(nicolas.getInfo(true));
        System.out.println(nicolas.getInfo(false));

        System.out.println("----------------------------------------");

        LocalDate today = LocalDate.now();
        int currentMonth = today.getMonthValue();
        int currentDay = today.getDayOfMonth();

        // return User and Admin with today's month and day (in past years)
        User birthdayUser = new User("Alex", 2002, currentMonth, currentDay);
        Admin birthdayAdmin = new Admin("Nicolas", 1964, currentMonth, currentDay);

        // Print greetings to demonstrate isBirthday(), age calculation, and overriding
        System.out.println(birthdayUser.getBirthdayGreeting());
        System.out.println(birthdayAdmin.getBirthdayGreeting());
    }
}