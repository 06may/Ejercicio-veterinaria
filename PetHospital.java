import java.util.ArrayList;

public class PetHospital {

    String nameVet;
    ArrayList<Room> rooms;
    ArrayList<Owner> costumers;

    public PetHospital(String nameVet){
        this.nameVet = nameVet;
        this.rooms = rooms;
    }

    public boolean addNewCostumer(Owner newCostumer) {
        this.costumers.add(newCostumer);
        return true;
    }

    public ArrayList<Owner> getCostumers() {
        return this.costumers;
    }
}
