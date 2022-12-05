public class Amphibians extends Animal { // земноводные

    private String habitat;

    static Predator[] predators = new Predator[4];      // [null, null, null, null]

    public void hunts() {

    }

    public Amphibians(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

}
