package rooms;

/*** * @author dallas */
public class RoomMaterials {
    private String floor, walls, roomName;
    private int windows, doors;
    public void roomInfo(){
System.out.println("The " + roomName +  " is made out of " + floor + " and " + walls);
System.out.println("With " + windows + " window(s) and " + doors + " door(s)");
    } 
    public void setFloor(String floor) {
		this.floor = floor;
	}
    public void setWalls(String walls) {
		this.walls = walls;
	}
    public void setWindows(int windows){
                this.windows = windows;
    }
    public void setDoors(int doors){
                this.doors = doors;
    }
    public void setRoomName(String roomName){
                this.roomName = roomName;
    }
}
