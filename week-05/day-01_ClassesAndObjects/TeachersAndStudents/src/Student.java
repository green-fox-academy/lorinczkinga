public class Student {
    String memory;
    String question;
    String givenAnswer;

    public Student() {
        this.question = "I have a question.";
        this.memory = "This is what is in my memory.";
    }

    public  void learn(Teacher teacher) {
        this.memory = teacher.teachingMaterial;
    }

    public void question(Teacher teacher) {
        this.givenAnswer = teacher.Answer();
    }
}
