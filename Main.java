import javax.print.Doc.;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        ArrayList<Room> rooms = new ArrayList<>();
        //rooms.add()
        PetHospital mascotaFeliz = new PetHospital("Mascota Feliz");
        Pet litoRodriguez = new Pet("Lito Rodríguez", (byte) 2, 1.5f, 0.5f, 0.3f);
        Owner costumer = new Owner("Juanito Pérez", litoRodriguez, 1234567890, (byte) 1);
        mascotaFeliz.addNewCostumer(costumer);
        System.out.println(mascotaFeliz.getCostumers());
    }

}
