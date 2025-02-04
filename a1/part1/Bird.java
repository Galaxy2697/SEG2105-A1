package a1.part1;

public class Bird extends Animal{
    private static int numberOfBirds = 0;

    public Bird(){
        super();
        numberOfBirds ++;
        System.out.println("Bird Constructor called");
    }

    public Bird(String name){
        super(name);
        numberOfBirds ++;
        System.out.println("Bird Constructor with name called");
    }

    public void makeSound(){
        System.out.println("Bird sound");
    }

    public String getAnimalType(){
        return "Bird";
    }

    public static int getNumberOfBirds(){
        return numberOfBirds;
    }
}
