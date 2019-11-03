package echipa1.models;

import java.util.ArrayList;

public class Events {
	private String eventname;
	private String eventdate;
	private String eventlocation;
	private String eventorganizer;
	private ArrayList<User> participants = new ArrayList<User>();

	public Events(String eventname, String eventdate, String eventlocation, String organizer) {
		super();
		// TODO Auto-generated constructor stub
		this.eventname = eventname;
		this.eventdate = eventdate;
		this.eventlocation = eventlocation;
		this.eventorganizer = organizer;
	}

	public String getEventlocation() {
		return eventlocation;
	}

	public void setEventlocation(String eventlocation) {
		this.eventlocation = eventlocation;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getEventdate() {
		return eventdate;
	}

	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}

	public String getEventorganizer() {
		return eventorganizer;
	}

	public void setEventorganizer(String eventorganizer) {
		this.eventorganizer = eventorganizer;
	}

	public ArrayList<User> getParticipants() {
		return participants;
	}

	public void setParticipants(ArrayList<User> participants) {
		this.participants = participants;
	}
}
