

public class OOPS {
    
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        BankAccount myAcc = new BankAccount();
        myAcc.username = "vivek";
        // myAcc.password ='a';
        myAcc.setPassword("12345");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;
    
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
    String getColor(){
        return this.color;
    }

    
}
class Student{
    String name;
    int age;
    float percentage;
    void calcPercentage(int phy,int chem,int math){
        percentage = (phy + chem + math) / 3;

    }
}

/*
 * Objects - Entities in the real world
 * Class - Group Of these entities
 *          attributes(properties) + functions(behaviour)
 * Get - to return the value
 * Set - to modify the value
 * this - this keyword is used to refer to the current object
 */
