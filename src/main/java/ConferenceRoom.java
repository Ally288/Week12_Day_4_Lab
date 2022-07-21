import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(int capacity, ArrayList<Guest> guestList, String name) {
        super(capacity, guestList);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return super.getCapacity();
    }

}
