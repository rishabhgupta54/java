public class Test {
    int[] values;

    Test(int size) {
        values = new int[size];
    }

    void printArray(int index) {
        if (index == 0){
            return;
        } else {
            printArray(index - 1);
        }
        System.out.println("[" + (index - 1) + "] = " + this.values[index]);
    }
}
