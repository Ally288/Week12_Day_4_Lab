import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    ArrayList<Guest> guestList;

    @Before
    public void before () {
        guest = new Guest("Bob");
        guestList = new ArrayList<>();
        bedroom = new Bedroom(guestList, 1, RoomType.SINGLE);
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void numOfGuestInRoom() {
        assertEquals(0, bedroom.getNumOfGuest());
    }

    @Test
    public void canAddGuest() {
        bedroom.add(guest);
        assertEquals(1, bedroom.getNumOfGuest());
    }

    @Test
    public void canRemoveGuests() {
        bedroom.add(guest);
        bedroom.clearRoom();
        assertEquals(0, bedroom.getNumOfGuest());
    }

}
