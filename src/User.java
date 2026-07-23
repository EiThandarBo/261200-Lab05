import java.time.LocalDate;

public class User {
    // Protected fields (denoted by '#' in UML)
    protected String name;
    protected LocalDate dob;

    // Default Constructor
    public User() {
        this.name = "Unknown";
        this.dob = LocalDate.now();
    }

    // Parameterized Constructor
    public User(String name, int year, int month, int day) {
        setName(name);
        setDob(LocalDate.of(year, month, day));
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate newDob) {
        // Validation: If newDob is in the future, fallback to today's date
        if (newDob != null && newDob.isAfter(LocalDate.now())) {
            this.dob = LocalDate.now();
        } else {
            this.dob = newDob;
        }
    }

    // return getInfo
    public String getInfo() {
        return "Name: " + name + ", DOB: " + dob;
    }

    // Checks if today is the user's birthday
    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonthValue() == dob.getMonthValue() &&
                today.getDayOfMonth() == dob.getDayOfMonth();
    }

    // Returns birthday greeting string
    public String getBirthdayGreeting() {
        if (isBirthday()) {
            return "Happy birthday " + name + "!";
        } else {
            return "It is not " + name + "'s birthday today.";
        }
    }
}