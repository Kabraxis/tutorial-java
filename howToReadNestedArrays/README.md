```java

 int arr[] = new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21 };
 int n = 6;
 n = arr[arr[n] / 2];
 System.out.println(n);

```

What does n print?

That one is tricky!
It took me a bit to understand what 'arr[arr[n] / 2]' is and how it works, and the best advice I can give you is to do it like me,
kind of "oldschool" by writing it on a piece of paper.

How I understand this is, the value 'arr[arr[n] / 2]' is nested. So we have to kind of work from the inside outwards
to get the right answer.
The first value we need to define is 'n', what is '6', since line 2 of the code says 'int n = 6'.
Now the value of 'n' reads 'arr[arr[6] / 2]'.

Next we need to define the inner-'arr', before we can solve the whole bracket by 'arr/ 2'.
Since [6] tells us that the value of the inner-'arr' is on 6th index position of the array we know it is the number '8'.
Now the value of 'n' reads 'arr[8 / 2]', and this can be solved to 'n = arr[4]'.

The last step is to look at the 4th index position and this is the number '3'. 
Therefore 'n' prints '3'.

I hope this will help you guys to understand what is happening here 

Cherrs
