
## No loop loops
The idea behind No loop loop is to showcase ways to create a loop in Java, but without making use of regular loops like for-, for each-, while-, do while-loops.


#### Methods loop
The way this loop works is that we call the ```firstMethod```, passing our argument ```aNumber``` to it.    
Then ```firstMethod``` checks, if a condition ```(aNumber <= 0)``` is given or not. If ```aNumber``` is ``` > 0``` nothing happens, and our argument ```aNumber``` will be passed to the ```secondMethod```.  
Now, ```secondMethod``` subtracts ```1``` from ```aNumber``` and passes it back again to ```firstMethod```, which will end the program as soon as ```aNumber``` reaches the value of ```<= 0```.
