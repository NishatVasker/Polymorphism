# Polymorphism
Implement the missing classes shown in the diagram shown below. For each class, the method signatures are provided, e.g., class Ham should have 3 methods named a(), b(), toString() which prints Ham a, Ham b and Ham respectively.
Implement the missing classes shown in the diagram shown below.
For each class, the method signatures are provided, e.g., class Ham should have 3 methods
named a(), b(), toString() which prints Ham a, Ham b and Ham respectively.
NB: In class Lamb method a() prints Ham a. To implement this you cannot write
System.out.println(“Ham a”). You have to use the concept of inheritance in Java.
Same thing goes for the similar methods in the diagram.
A tester class Polymorphism is provided to test the classes with output in the next page.


<code>public class Polymorphism {

public static void main (String [] args){

Ham[] food = { new Spam(), new Yam(),

new Ham(), new Lamb() };

for (int i = 0; i < food.length; i++) {

System.out.println(food[i]);

food[i].a();

food[i].b();

System.out.println();

}

}
}</code>


<output>Output:
Yam

Spam a

Lamb b

Yam

Yam a

Lamb b

Ham

Ham a

Ham b

Ham

Ham a

Lamb b</output>
