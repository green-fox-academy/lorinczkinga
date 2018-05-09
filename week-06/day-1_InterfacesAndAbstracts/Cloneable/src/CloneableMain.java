public class CloneableMain {
    public static void main(String[] args) {

        Student student = new Student("John", 20, "male", "BME");
        Student studentClone;
        studentClone = student.clone();
    }
}
