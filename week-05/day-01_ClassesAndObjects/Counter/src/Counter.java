public class Counter {
    int value;
    int originaValue;

    public Counter() {
        this.originaValue = 0;
        this.value = 0;
    }

    public Counter(int value) {
        this.originaValue = value;
        this.value = value;
    }

    public void add(int number) {
        this.value += number;
    }

    public void add() {
        this.value ++;
    }

    public int get() {
        return this.value;
    }

    public void reset() {
        this.value = this.originaValue;
    }
}
