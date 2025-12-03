public class overloaded_counter {
   
    private int value;



    public overloaded_counter(int startValue) {
        this.value = startValue;
    }

    public overloaded_counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void decrease() {
        this.value = this.value - 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            return;
        }
        this.value = this.value + increaseBy;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            return;
        }
        this.value = this.value - decreaseBy;
    }
}
