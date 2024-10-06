package a1.part1;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal one = new UnknownAnimal();
        Animal two = new UnknownAnimal();
        Animal three = new NamedAnimal("three");
        Animal four = new NamedAnimal("four");
        animals.add(one);
        animals.add(two);
        animals.add(three);
        animals.add(four);

        List<Mammal> mammal = new ArrayList<>();
        Mammal five = new Mammal();
        Mammal six = new Mammal();
        Mammal seven = new Mammal("seven");
        Mammal eight = new Mammal("eight");
        mammal.add(five);
        mammal.add(six);
        mammal.add(seven);
        mammal.add(eight);

        List<Bird> bird = new ArrayList<>();
        Bird nine = new Bird();
        Bird ten = new Bird();
        Bird eleven = new Bird("eleven");
        Bird twelve = new Bird("twelve");
        bird.add(nine);
        bird.add(ten);
        bird.add(eleven);
        bird.add(twelve);

        List<Dog> dog = new ArrayList<>();
        Dog a = new Dog();
        Dog b = new Dog();
        Dog c = new Dog("a");
        Dog d = new Dog("b");
        dog.add(a);
        dog.add(b);
        dog.add(c);
        dog.add(d);

        List<Parrot> parrot = new ArrayList<>();
        Parrot e = new Parrot();
        Parrot f = new Parrot();
        Parrot g = new Parrot("g");
        Parrot h = new Parrot("h");
        parrot.add(e);
        parrot.add(f);
        parrot.add(g);
        parrot.add(h);

        System.out.println();

        System.out.println("Animals making sounds:");
        for(int i = 0; i < 4; i ++){
            Animal tmp = animals.get(i);
            tmp.makeSound();
        }

        System.out.println();

        System.out.println("Mammals making sounds:");
        for(int i = 0; i < 4; i ++){
            Mammal tmp1 = mammal.get(i);
            tmp1.makeSound();
        }

        System.out.println();

        System.out.println("Birds making sounds:");
        for(int i = 0; i < 4; i ++){
            Bird tmp2 = bird.get(i);
            tmp2.makeSound();
        }

        System.out.println();

        System.out.println("Dogs making sounds:");
        for(int i = 0; i < 4; i ++){
            Dog tmp3 = dog.get(i);
            tmp3.makeSound();
        }

        System.out.println();


        System.out.println("Parrots making sounds:");
        for(int i = 0; i < 4; i ++){
            Parrot tmp4 = parrot.get(i);
            tmp4.makeSound();
        }
    }

}
