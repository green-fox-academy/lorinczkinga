public abstract class Plant {
    protected String color;
    protected double waterAmountOfThePlant;
    public int wateringLimit;
    public double absorbWater;


    public Plant(String color) {
        this.color = color;
        this.waterAmountOfThePlant = 0;
    }

    public void watering(int waterAmount) {
        if (needsWater()) {
            waterAmountOfThePlant =+ waterAmount * absorbWater;
        }
    }
    public boolean needsWater() {
        if (waterAmountOfThePlant < wateringLimit) {
            return true;
        } else {
            return false;
        }
    }

    public void plantInfo() {
        String result = "";
        result += "The " + color + " " + getClass().getSimpleName();
        if (needsWater()) {
            result += " needs water.";
        } else {
            result += " doesn't need water.";
        }
        System.out.println(result);
    }
}
