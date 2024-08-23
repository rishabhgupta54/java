class Array {
    public static void main(String[] args) {
        int[] monthArray;
        monthArray = new int[12];

        monthArray[0] = 31;
        monthArray[1] = 28;
        monthArray[2] = 31;
        monthArray[3] = 30;
        monthArray[4] = 31;
        monthArray[5] = 30;
        monthArray[6] = 31;
        monthArray[7] = 31;
        monthArray[8] = 30;
        monthArray[9] = 31;
        monthArray[10] = 30;
        monthArray[11] = 31;

        System.out.println("April has " + monthArray[3] + " days");
    }
}