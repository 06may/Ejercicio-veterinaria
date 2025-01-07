public class Room {
    byte roomNumber;
    Doctor doc;
    Owner owner;

    public Room(byte roomNumber, Doctor doc){
        this.roomNumber = roomNumber;
        this.doc = doc;
    }

    public void assignRoom(Owner costumer){
        this.owner = costumer;
    }

    public Owner getPet() {
        return owner;
    }

    public void setPet(Owner owner) {
        this.owner = owner;
    }


    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }


    public byte getNumConsultorio() {
        return numConsultorio;
    }

    public void setNumConsultorio(byte numConsultorio) {
        this.numConsultorio = numConsultorio;
    }

}
