public class FlyingBirds extends Birds { //летающие
    private String movementType;

    public void fly() {
    }

    public FlyingBirds(String movementType) {
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



//    @Override
//    public void eat() {
//
//    }
//
//    @Override
//    public void go() {
//
//    }
}


