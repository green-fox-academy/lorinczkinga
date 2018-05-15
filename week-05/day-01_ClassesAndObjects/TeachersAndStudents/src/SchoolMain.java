public class SchoolMain {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        System.out.println(student.givenAnswer);
        student.question(teacher);
        System.out.println(student.givenAnswer);

        System.out.println(student.memory);
        teacher.teach(student, teacher);
        System.out.println(student.memory);

    }
}
