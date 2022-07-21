import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;

    public Hotel (ArrayList<Bedroom> bedroomList, ArrayList<ConferenceRoom> conferenceRoomList) {
        this.bedroomList = bedroomList;
        this.conferenceRoomList = conferenceRoomList;
    }

    public int canCheckNumOfBedrooms() {
        return bedroomList.size();
    }

}
