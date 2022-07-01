package aggregation;

public class Member {
	
//	Instance Variables
	private int memberId;
	private String name;
	private Room room;
	
//	Constructors
	public Member( int memberId, String name ) {
		this.memberId = memberId;
		this.name = name;
	}
	
//	Methods
    public String toString(){
        return "Member\nmemberId: "+this.memberId+"\nname: "+this.name;
    }

//	Getters and Setters
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
	

}
