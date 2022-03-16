```java

 int arr[] = new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21 };
 int n = 6;
 n = arr[arr[n] / 2];
 System.out.println(n);

```

What will be the output?

The answer for this is harder for a beginner than it might look at first, as I did not know that I have to do some math in order to tell the result of this question.

It took me a bit to understand what ```arr[arr[n] / 2]``` is and how it works, but a good advice I read on my journey to learn how to code helped me here:
*Write each and every step down on a sheet of paper with a pencil.*

By doing so, I found out ```arr[arr[n] / 2]``` is a nested value and from math I knew to solve brackets first. Which made me conclude, I will have to work my way from the inside out to solve it.

The first thing to do was to put in a value for the placeholder ```n```, which obviously is ```6```, as the second line of the code says exactly this: ```int n = 6```.

It now was a little clearer to me, because that the value reads ```arr[arr[6] / 2]```, and I could go on by defining the ```arr``` in the next bracket, because it looked like something that must be divided by ```2```.

Having in mind the basics of an array, I could identify ```arr[6]``` as the 6th index position of the array, which is the number ```8```.

I filled this into the brackets, it reads ```arr[8 / 2]``` and could do some basic math on it. So ```8 / 2 = 4```, and there was another value to put in ```arr[arr[4]]```.

At this point it was super clear to me that it now reads “index of arr is the value on index position ```4``` of the array”, which is the number ```3```.
So the output will be ```3```.

I hope this might help some of you to understand how to read and solve such a value, and to understand what the code is doing.

Cheers
