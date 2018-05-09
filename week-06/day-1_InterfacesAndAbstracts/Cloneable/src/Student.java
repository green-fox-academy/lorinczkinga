public class Student implements Cloneable {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public Student() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "The School of Life";
        skippedDays = 0;

    }

    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender +
                " from " + previousOrganization + " who skipped "+  skippedDays + " days from the course already.");
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    @Override
    public Student clone() {
        Student studentClone = new Student();
        studentClone.name = this.name;
        studentClone.age = this.age;
        studentClone.gender = this.gender;
        studentClone.previousOrganization = this.previousOrganization;
        studentClone.skippedDays = this.skippedDays;

        return studentClone;
    }

}

