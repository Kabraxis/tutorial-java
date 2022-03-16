
**About this tutorial**

This guide does not cover every detail about methods and is focusing mainly on return value methods. For the sake of simplicity, I will not explain the basic syntax, like how to define a method or what signatures are.
Please also keep in mind the terms I use may not be correct. So when I talk about "sending data" this is only for illustration purposes, please do not use them in your exam or something.
This is my simplified understanding of how methods work and can be used by beginners to understand methods do.
Everyday analogies often help me to understand things, since they feel like being able to "grab" them, metaphorically speaking.

A method is a sequence of statements packed together to perform an operation, a program inside your program, if you will. The idea behind methods is to divide a program into small and easy to maintain parts/tasks, that can be reused.
One of the benefits of it is a better overview of the code and the ability to change parts with little effort.

It took me quite some time to understand how methods work and how they can be called or as I like to say "how to send data between methods".
I write this in intention to share my thoughts, so I may help others to also get a better understanding of this important topic.
 <br/>
 
```java    
 public class MyClass {
    public static void main(String args[]) {
```
    
I think of methods like specialized factories. Every factory has a grappling hook to catch material and carry it back to the factory, where the factory makes cool stuff out of it.
Let's say we want to have a Shiny Sword.
What are swords made of? Right, iron!

So, what we need is:
1. Some Iron Ore
2. An Iron Forge to smelt it and make an Iron Bar
3. For the last step, we need a decent Sword Smith

<br/>

```java
    // Step 1: Say hello to our Iron Ore!    
            String material = "Iron Ore";
    
    // Step 2: Now we want to get the Iron Bar. So the grappling hook of the factory "ironForge" (the method) is carrying the Iron Ore to it.
    (Next: See Step 3 a few lines below)
            String ironBar = ironForge(material);
    
    // Step 5: As the Iron Bar is ready now grappling hook of the factory "swordSmith" can carry it to make our sword. (Next: See Step 6 a few lines below, the method swordSmith)
            String shinySword = swordSmith(ironBar);
    
    // Finally! There is our Shiny Sword, congratulations!
            System.out.println("Shhhhiiiinnngggg !! \nYou obtained a nice " +shinySword + " !");
    
    }
    
    // Step 3: The material, our Iron Ore, arrives at the factory ironForge - yay!
    public static String ironForge(String material) {    
            return material = "Iron Bar"; // Step 4: Here the magic happens and our material "Iron Ore" is returned from the ironForge as Iron Bar. (Next: See Step 5 a few lines above, the string variable shinySword)
    }
    
    // Step 6: Alright, the ironBar has arrived at the swordSmith and our sword soon will be ready.
    public static String swordSmith(String ironBar) {
            return ironBar = "Shiny Sword"; // Step 7: The swordSmith is wielding his hammer *clink clink* and there we go, our ironBar now has become a Shiny Sword. Let's have a look at it, shall we? (Next: See Step Finally a few lines above)
    }  
  }
