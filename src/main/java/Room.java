import java.util.ArrayList;

public abstract class Room extends Hotel{

    private int capacity;
    private ArrayList<Guest> guestList;

    public Room (int capacity, ArrayList<Guest> guestList){
        this.capacity = capacity;
        this.guestList = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumOfGuest(){
        return guestList.size();
    }

    public void add(Guest guest) {
        guestList.add(guest);
    }

    public void clearRoom() {
        guestList.clear();
    }


}
