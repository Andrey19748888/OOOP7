public  class Flightless extends Birds { // нелетающие
    private String movementType;

    public void walk() {
    }

    public Flightless(String movementType) {
        this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

}
