import java.time.LocalDate;

public class Admin extends User {

    // Default Constructor
    public Admin() {
        super();
    }

    // Parameterized Constructor
    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    //  Override getInfo()
    @Override
    public String getInfo() {
        return super.getInfo() + " | User type: admin";
    }

    //  Overload getInfo(boolean full)
    public String getInfo(boolean full) {
        if (full) {
            return getInfo() + " | Date: " + LocalDate.now();
        } else {
            return "Name: " + getName();
        }
    }

    // Helper method to calculate exact age in years based on today's year and dob year
    public int getAge() {
        LocalDate today = LocalDate.now();
        return today.getYear() - getDob().getYear();
    }

    // Override getBirthdayGreeting() to include age if it's their birthday
    @Override
    public String getBirthdayGreeting() {
        String baseGreeting = super.getBirthdayGreeting();
        if (isBirthday()) {
            return baseGreeting + " You are " + getAge() + " years old!";
        }
        return baseGreeting;
    }
}