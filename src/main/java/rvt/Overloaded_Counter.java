package rvt;
public class Overloaded_Counter {
    private int value;

    // Constructor that sets the start value
    public Overloaded_Counter(int startValue) {
        this.value = startValue;
    }

    // Constructor that sets the start value to 0
    public Overloaded_Counter() {
        this.value = 0;
    }

    // Returns the current value
    public int value() {
        return this.value;
    }

    // Increases the value by 1
    public void increase() {
        this.value++;
    }

    // Decreases the value by 1
    public void decrease() {
        this.value--;
    }

    // Increases by a given amount if the amount is positive
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    // Decreases by a given amount if the amount is positive
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }
}
