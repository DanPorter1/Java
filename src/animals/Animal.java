package animals;

abstract class Animal {

    protected AnimalType animalType;
    protected String name;

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.animalType = type;
    }

    public String getName() {
        return name;
    }
}
