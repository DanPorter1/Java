package animals;

import java.util.ArrayList;

public class Runner {

    static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Duck("Quack"));
        animals.add(new Fish("Swimmy"));
        animals.add(new Duck("Tony"));
        animals.add(new Fish("Sammy"));
        animals.add((new Penguin("Penny")));

        for (Animal a : animals) {
            if (a instanceof Bird b) {
                System.out.println(String.format("%s - %s",b.getName(), b.makeNest()));
            }
            else {
                System.out.println(a.getName() + " has no need for a nest");
            }
//            System.out.println(a.getName());
//            System.out.println(a.animalType);
        }
    }
}
