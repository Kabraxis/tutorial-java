
## No loop loops
The idea behind No loop loop, or to use the correct term "recursion", is to illustrate a way to create a loop in Java, but without making use of regular loops like for-, for each-, while-, do while-loops.


#### Methods loop
The way this loop works is by a call of the ```firstMethod```, passing our argument ```aNumber``` to it.    
Next, ```firstMethod``` checks, if a condition ```(aNumber <= 0)``` is given or not. If ```aNumber``` is ``` > 0``` nothing happens, and our argument ```aNumber``` will be passed to ```secondMethod```.  
Now, ```secondMethod``` subtracts ```1``` from ```aNumber``` and passes it back again to ```firstMethod```, which will end the program as soon as ```aNumber``` reaches the value of ```<= 0```.

>**Please note: recursion can have significant memory usage implications, as each recursive call requires additional stack space, and can result in a StackOverflowError if the recursion depth gets too large.**

``` java
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
```
