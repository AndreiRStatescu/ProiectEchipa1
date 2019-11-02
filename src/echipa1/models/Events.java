package echipa1.models;

import java.util.ArrayList;

public class Events {
	private String eventname;
	private String eventdate;
	private String eventlocation;
	private ArrayList<User> organizers = new ArrayList<User>();

	public Events(String eventname, String eventdate, String eventlocation) {
		super();
		// TODO Auto-generated constructor stub
		this.eventname = eventname;
		this.eventdate = eventdate;
		this.eventlocation = eventlocation;
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

	public ArrayList<User> getOrganizers() {
		return organizers;
	}

	public void setOrganizers(ArrayList<User> organizers) {
		this.organizers = organizers;
	}
}
