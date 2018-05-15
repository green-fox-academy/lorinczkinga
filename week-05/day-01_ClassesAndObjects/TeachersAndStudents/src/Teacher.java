public class Teacher {
    String answer;
    String teachingMaterial;

    public Teacher() {
        this.answer = "This is the answer.";
        this.teachingMaterial = "You have to learn this.";
    }

    public Teacher(String teachingMaterial, String answer) {
        this.answer = answer;
        this.teachingMaterial = teachingMaterial;
    }

    public  String Answer() {
        return this.answer;
    }

    public String teach(Student student, Teacher teacher) {
        student.learn(teacher);
        return this.teachingMaterial;

    }

}
