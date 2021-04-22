///Id: 2020-2-60-209
///Nishat Vasker
/*
public class Ham {
    void a() {
        System.out.println("Ham a");
    }
    void b(){
        System.out.println("Ham b");}

    public String toString(){
        return "Ham";
    }
}

public class Lamb extends Ham{
    void a() {
        System.out.println("Lamb a");
    }
    void b(){
        System.out.println("Lamb b");
    }
    public String toString(){
        return "Ham";
    }
}

public class Yam extends Lamb{
    void a(){
        System.out.println("Yam a");
    }
    public String toString(){
        return "Yam";
    }
}

public class Spam extends Yam{
    void a(){
        System.out.println("Spam a");
    }
    public String toString(){
        return "Yam";
    }
}


*/

public class Polymorphism {
    public static void main (String [] args) {
        Ham[] food = {new Spam(), new Yam(), new Ham(), new Lamb()};
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
            food[i].a();
            food[i].b();
            System.out.println();
        }
    }

}
