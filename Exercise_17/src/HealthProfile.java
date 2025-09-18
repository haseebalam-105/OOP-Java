public class HealthProfile
{
    private String firstName;
    private String lastName;
    private String gender;
    private double height;
    private double weight;
    private int currentYear;
    private DateOfBirth dob;

    public HealthProfile(String firstName, String lastName, String gender, double height, double weight, DateOfBirth dob,int currentYear) {
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setHeight(height);
        setWeight(weight);
        setDob(dob);
        setCurrentYear(currentYear);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public DateOfBirth getDob() {
        return dob;
    }

    public void setDob(DateOfBirth dob) {
        this.dob = dob;
    }


    public int calculateAge()
    {
        return getCurrentYear() - getDob().getYear();
    }

    public int MaxHeartRate()
    {
        return 220-calculateAge();
    }

    public String targetHeartRate()
    {
        int maxRate = MaxHeartRate()-calculateAge();

        double lowRate = 0.50 * maxRate;
        double highRate = 0.85 * maxRate;

        return String.format("%.2f - %.2f " , lowRate , highRate);
    }

    public double calculateBMI()
    {
        return (weight / (height*height));
    }

    public String BMICategory()
    {
        if (calculateBMI() < 18.5)
        {
            return "Underweight";
        }
        else if (calculateBMI() >= 18.5 && calculateBMI() < 24.9)
        {
            return "Normal weight";
        }
        else if (calculateBMI() >= 25 && calculateBMI() < 29.9)
        {
            return "Overweight";
        }
        else
        {
            return "Obesity";
        }
    }

    public void displayInfo()
    {
        System.out.printf("Name : %s %s %n" , getFirstName(),getLastName());
        System.out.println("Gender : " + getGender());
        System.out.println("Height : " + getHeight());
        System.out.printf("Weight : %.2fkg %n" , getWeight());
        System.out.println("Date of Birth : " + getDob().getDay() + "-" +getDob().getMonth() + "-" + getDob().getYear());
        System.out.println("Current Year : " + getCurrentYear());
        System.out.println("Age in years : " + calculateAge());
        System.out.println("Maximum Heart Rate : " + MaxHeartRate());
        System.out.println("Target Heart Rate : " + targetHeartRate());
        System.out.printf("BMI : %.2f %n" , calculateBMI());
        System.out.println("BMI Category : " + BMICategory());

    }
}
