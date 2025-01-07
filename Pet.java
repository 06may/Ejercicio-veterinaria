public class Pet {
    String petName;
    byte petAge;
    float petWeight;
    float petWidth;
    float petHeight;

    public Pet(String petName, byte petAge, float petWeight, float petWidth, float petHeight) {
        this.petName = petName;
        this.petAge = petAge;
        this.petWeight = petWeight;
        this.petWidth = petWidth;
        this.petHeight = petHeight;
    }

    enum estadoSalud {
        REGULAR,
        BUENO,
        MUY_BUENO
    }
}
