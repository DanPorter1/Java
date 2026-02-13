package animals;

abstract class Bird extends Animal {

    public Bird(String name, AnimalType bird){
        super(name, AnimalType.Bird);
    }

    public abstract String makeNest();
}
