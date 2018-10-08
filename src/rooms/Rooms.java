
package rooms;

/*** @author dallas*/
public class Rooms {

    public static void main(String[] args) {
        	LivingRoom myLivingRoom = new LivingRoom();
                myLivingRoom.setRoomName("Living Room");
		myLivingRoom.setDoors(1);
                myLivingRoom.setFloor("concrete");
                myLivingRoom.setWalls("drywall");
                myLivingRoom.setWindows(1);
                myLivingRoom.roomInfo();
                
                Bathroom myBathroom = new Bathroom();
                myBathroom.setRoomName("bathroom");
                myBathroom.setDoors(1);
                myBathroom.setFloor("vinyl");
                myBathroom.setWalls("tile");
                myBathroom.setWindows(0);
                myBathroom.roomInfo();
	}
        

    }
    

