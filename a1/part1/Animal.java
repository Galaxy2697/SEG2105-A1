package a1.part1;

public abstract class Animal implements  SoundMaker{
    private static int numberOfAnimals = 0;

    private String name;

    public Animal(){
        numberOfAnimals ++;
        System.out.println("Animal Constructor called");
        this.name = "Unknown Animal";
    }

    public Animal(String name){
        numberOfAnimals ++;
        System.out.println("Animal Constructor with name called");
        this.name = name;
    }

    public abstract String getAnimalType();

    public abstract void makeSound();

    public static int getNumberOfAnimals(){
        return numberOfAnimals;
    }
}
