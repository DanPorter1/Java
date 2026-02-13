package animals;

public class Duck extends Bird {

    public Duck(String name) {
        super(name, AnimalType.Bird);
    }

    @Override
    public String makeNest() {
        return "Duck made a nest!";
    }
}
