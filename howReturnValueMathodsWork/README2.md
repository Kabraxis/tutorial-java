If you are a person like me who has a pretty visual thinking or if you sometimes just understand things easier if you have an image of it in your head, maybe this helps you:

Imagine a method like a machine that should process materials for you.
The return value describes if the machine should send you the processed goods back for further processing. 
The parameters tell the machine what ingredients it will receive for processing.

Think of a smelting furnace which has to produce steel ingots and therefore gets coal and iron ore.
The `signature` of it might look like that:

```java    
public static steelIngots smeltingFurnace(ingredient coal, ingredient iron ore)
```

So now that we have our `smeltingFurnace` we need to tell it what it has to do, and this is described inside the machine like this:

```java  
public static steelIngots smeltingFurnace(ingredient coal, ingredient ironOre) {
product ingotOfSteel = coal + ironOre; // here we process our ingredients to a nice steel ingot.
return ingotOfSteel; // here we "send" back the steel ingot, so another machine can make maybe a sword from it, or we can store it.
}
```

In our `main method` we invoke the method (hey, wake up, make `steel ingots`!) like that:

```java
smeltingFurnace(coal, ironOre); // this "sends" the ingredients to the smelting furnace, and "becomes" the steel ingot
```

In this example, nothing would ever happen to the `steel ingot`, we just threw the `coal` and `iron ore` into the `smeltingFurnace` and did nothing with the returned `ingot`.
So, let's create a `stockpile` in our `main method` in which we store our `steel ingot`.

```java
property stockpile = smeltingFurnace(coal, ironOre);
```

Now the `stockpile` contains our `steel ingot`.

In code, this might look something like this (simplified):

```java
public static void main(String[] args) {
ingredient coal = 1;
ingredient ironOre = 1;

property stockpile = smeltingFurnace(coal, ironOre);

Show.me.the.item(stockpile); // this shows (prints) 1 steel ingot
}

public static steelIngots smeltingFurnace(ingredient coal, ingredient ironOre) {
product ingotOfSteel = coal + ironOre;
return ingotOfSteel; 
}
```

I hope this makes things a bit clearer to you :)

Cheers
