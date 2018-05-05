public class MainSharpieSet {
    public static void main(String[] args) {
        SharpieSet sharpieset = new SharpieSet();

        sharpieset.SharpieList.add(new Sharpie("pink", (float)10.333332));
        sharpieset.SharpieList.add(new Sharpie("gold", (float)4));

        for (int i = 0; i < 10; i++) {
            sharpieset.SharpieList.get(1).use();
        }
        System.out.println(sharpieset.countUsable());


    }
}
