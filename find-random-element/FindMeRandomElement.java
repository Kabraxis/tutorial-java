// Those two lines are the class, and the main method.
public class FindMeRandomElement {
    public static void main(String[] args) {
        
        // The coding logic starts here
        String[] romanNumbers = {"I", "II", "III", "IV", "V"}; // A string array.
        int minValue = 1; // The lowest number to use, because you should not take the 0th element of the array.
        int maxValue = romanNumbers.length; // The highest number to use, because you should take a higher number than the array's length.
        // The random number, which is generated in the method needRandomIntegersPlz. It "sends" the max/min value to the method, so it can generate the random number.
        int whatRandomIntShouldWeUse = needRandomIntegersPlz(maxValue, minValue);
        System.out.println(romanNumbers[whatRandomIntShouldWeUse]); // This print-statement prints a random index between 1 and 4.
    }

    public static int needRandomIntegersPlz(int maxValue, int minValue) { // This method generates the random number. It "receives" the max/min value we "sent" to it.
        // Step 1: Here the random number is generated, but this formula creates a double value in Java.
        double randomDouble = Math.floor(Math.random() * (maxValue - minValue)) + minValue;
        // Step 2: Since we need an integer, we have to explicitly cast the randomDouble to an integer value.
        int randomInteger = (int) (randomDouble); // It makes an integer out of the double.
        return randomInteger; // Here we return the randomInteger, so it can be used in our print-statement.
    }
}
