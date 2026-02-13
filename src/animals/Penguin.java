package animals;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name, AnimalType.Bird);
    }

    @Override
    public String makeNest() {
        return "Penguin made a nest!";
    }
}
