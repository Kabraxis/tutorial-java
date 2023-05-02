Originally I posted this explanation about nested loops on 16.02.2020 at [Hyperykill](https://hyperskill.org/learn/step/3505#comment-73830).
From what I've learned in the theory part I was unable to understand the concept of a nested loops. So I came up with this guide, after I did research the topic online.

Ok guys, so I don't know how you think about the nested for loops, but the example here on Hyperskill doesn't explain anything. I simply don't understand why the code in §3. does what it does.

> As an example, the following code prints the multiplication table of numbers from 1 to 9 (inclusive).

```java
for (int i = 1; i < 10; i++) {
    for (int j = 1; j < 10; j++) {
        System.out.print(i * j + "\t");
    }
    System.out.println();
}
```

> It outputs:

```java
1   2   3   4   5   6   7   8   9  
2   4   6   8   10  12  14  16  18  
3   6   9   12  15  18  21  24  27  
4   8   12  16  20  24  28  32  36  
5   10  15  20  25  30  35  40  45  
6   12  18  24  30  36  42  48  54  
7   14  21  28  35  42  49  56  63  
8   16  24  32  40  48  56  64  72  
9   18  27  36  45  54  63  72  81 
```


Because there is no explanation here, I did some research and came up with a really simple and great explanation.

We have two for loops:
```java
Loop 1 - Step 1: ----> for (int i = 1; i < 10; i++) {
Loop 2 - Step 1: ----> for (int j = 1; j < 10; j++) {
Loop 2 - Step 2: ----> System.out.print(i * j + "\t");
    }
   Loop 1 - Step 2: ----> System.out.println();
}
```

What happens here during execution?

```Loop 1``` - ```Step 1``` is started, the variable ```i``` is set to the value ```1```.
```Loop 2``` - ```Step 1``` is started, the variable ```j``` is set to the value ```1```.
Now ```Loop 2``` - ```Step 2``` is started, ```i = 1``` is multiplied by ```j = 1``` and a ```TAB``` is inserted.

**ATTENTION**: ```Loop 1``` - ```Step 2``` won't start yet!!
Nope, now ```Loop 2``` - ```Step 1``` starts again, which means the code checks if ```j``` is still smaller than ```10``` - ```yes``` (```j < 10; true;```). Therefore ```j++``` will be now executed, so we now have ```j = 2```.
Next again ```Loop 2``` - ```Step 2```, so ```i``` (still with value ```1```) is multiplied by ```j = 2``` and a ```TAB``` is inserted.

```Loop 2``` - ```Step 2``` will be executed until ```j``` has reached the value ```10``` (```j < 10; false;```).
Only NOW ```Loop 1``` - ```Step 2``` will be executed! A ```new line``` is inserted and the code starts again at ```Loop 1``` - ```Step 1```.

You can also imagine the whole thing figuratively like a clock. 
```Loop 1``` is the ```hour hand```.
```Loop 2``` is the ```minute hand```.
Only after ```Loop 2``` has been executed ```60 times``` on a clock (60 minutes = 1 hour ;-) ), the hour hand moves forward and the process is starting all over again.

I hope by this could explain to you how nested for loops work :-)
