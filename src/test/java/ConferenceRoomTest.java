import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;
    ArrayList<Guest> guestList;

    @Before
    public void before () {
        guest = new Guest("Bob");
        guestList = new ArrayList<>();
        conferenceRoom = new ConferenceRoom(100, guestList, "HAW YEAH");
    }

    @Test
    public void hasName() {
        assertEquals("HAW YEAH", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, conferenceRoom.getCapacity());

    }

    @Test
    public void numOfGuestInRoom() {
        assertEquals(0, conferenceRoom.getNumOfGuest());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.add(guest);
        assertEquals(1, conferenceRoom.getNumOfGuest());
    }

    @Test
    public void canRemoveGuests() {
        conferenceRoom.add(guest);
        conferenceRoom.clearRoom();
        assertEquals(0, conferenceRoom.getNumOfGuest());
    }

}
