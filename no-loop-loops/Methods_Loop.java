public class Methods_Loop {
    public static void main(String[] args) {
        int aNumber = 10;
        firstMethod(aNumber); // Inputting the number
    }

    public static void firstMethod(int aNumber) {
        System.out.println("firstMethod: " + aNumber);
        if (aNumber <= 0) {
            return; // This will end your program
        }

        secondMethod(aNumber);
    }

    public static void secondMethod(int aNumber) {
        aNumber = aNumber - 1;
        System.out.println("secondMethod: " + aNumber);
        firstMethod(aNumber);
    }

}
