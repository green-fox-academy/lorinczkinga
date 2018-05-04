public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width) {
        this.inkAmount = 100;
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmount -= 10;
    }

    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("pink", (float)10.333332);

        sharpie.use();
        System.out.println(sharpie.inkAmount);
    }
}
