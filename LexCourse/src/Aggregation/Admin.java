package aggregation;

public class Admin {
	
	public void assignRoom( Room[] rooms, Member member ) {
		for( Room room: rooms ) {
			if( room.getCapacity()>0 && room.getCapacity()<=4 ) {
				member.setRoom(room);
				room.setCapacity(room.getCapacity()-1);
				break;
			}
		}
	}
	
	
}
