// Superclass
class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
}
// Subclass inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call superclass constructor
    }
    public void bark() {
        System.out.println(name + " is barking.");
    }
    //Method overriding
    @Override
     public void eat() {
        System.out.println(name + " is eating bones.");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.eat(); // Inherited method
        myDog.bark(); // Method specific to Dog
        Animal p = new Dog("Jade");
        p.eat();


        Animal a = new Animal("Jade");
        a.eat();
        a = p;
        a.eat();
        
        a = myDog;
        a.eat();
        
        myDog = a;// compile error
    }
}
