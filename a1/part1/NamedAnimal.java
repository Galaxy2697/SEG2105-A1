package a1.part1;

public class NamedAnimal extends Animal{

    public NamedAnimal(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Named animal sound");
    }

    @Override
    public String getAnimalType() {
        return "Named Animal";
    }
}
