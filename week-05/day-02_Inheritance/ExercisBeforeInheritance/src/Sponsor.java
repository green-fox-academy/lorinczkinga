public class Sponsor {
    String name;
    int age;
    String gender;
    String company;
    int hiredStudens;

    public Sponsor() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        company = "Google";
        hiredStudens = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudens = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender +
                " who represents " + company + " and hired " + hiredStudens + " student so far.");
    }

    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public void hire() {
        hiredStudens ++;
    }
}
