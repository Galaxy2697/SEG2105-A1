package a1.part1;

public class Parrot extends Bird{

    public Parrot(){
        super();
        System.out.println("Parrot Constructor called");
    }

    public Parrot(String name){
        super(name);
        System.out.println("Parrot Constructor with name called");
    }

    public void makeSound(){
        System.out.println("Squawk!");
    }

    public String getAnimalType(){
        return "Parrot";
    }
}
