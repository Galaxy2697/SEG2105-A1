package a1.part1;

public class UnknownAnimal extends Animal{

    public UnknownAnimal(){
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Unknown animal sound");
    }

    @Override
    public String getAnimalType() {
        return "Unknown Animal";
    }
}
