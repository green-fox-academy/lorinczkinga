public class TodoPrint {
    public static void main(String[] args) {
        StringBuilder todoText = new StringBuilder(" - Buy milk\n");

        todoText.insert(0, "My todo:\n");
        todoText.append(" - Download games\n\t - Diablo");

        System.out.println(todoText);
    }
}
