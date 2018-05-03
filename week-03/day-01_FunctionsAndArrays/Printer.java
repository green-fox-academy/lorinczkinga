public class Printer {
   public static void main(String[] args) {
       printer("first", "second", "third", "fourth");
   }

   public static void printer(String ... strings) {
       for (String arg : strings) {
           System.out.println(arg);
       }
   }
}
