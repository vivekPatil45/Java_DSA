

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);

        Chiken c = new Chiken();
        c.eat();
        c.walk();

    }
}
abstract class Animals{

    String color;

    Animals(){
        color = "Brown";
    }

    void eat(){
        System.out.println("animal eat");
    }
    abstract void walk();
}

class Horse extends Animals{

    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("Walks on 4 legs");

    }
}

class Chiken extends Animals{

    void changeColor(){
        color = "yellow";
    }

    void walk(){
        System.out.println("Walks on 2 legs");
        
    }
}

/*
 * Abstraction all the unnecessary details and showing only the important parts to the user
 * 
 */