package week_4;

public class Ex75 {
    private int value;


    public Ex75(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }


    public static void main(String[] args) {
        Ex75 counter = new Ex75(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

    }
}
