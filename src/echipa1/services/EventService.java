package echipa1.services;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import echipa1.Database;
import echipa1.models.Events;

public class EventService {

	public void createJson() {
		JSONArray eventList = new JSONArray();
		for (Events event : Database.events) {

			JSONObject eventDetails = new JSONObject();
			eventDetails.put("eventName", event.getEventname());
			eventDetails.put("eventDate", event.getEventdate());
			eventDetails.put("eventLocation", event.getEventlocation());
			eventDetails.put("eventorganizer", event.getEventorganizer());
			ArrayList<String> participants = new ArrayList<String>();
			for (int i = 0; i < event.getParticipants().size(); i++) {
				participants.add(event.getParticipants().get(i).getUsername());
			}
			eventDetails.put("eventparticipants", participants);

			JSONObject eventObject = new JSONObject();
			eventObject.put("event", eventDetails);

			eventList.put(eventObject);

			saveJson(eventList);
		}
	}

	private void saveJson(JSONArray eventList) {
		// Write JSON file
		try (FileWriter file = new FileWriter("events.json")) {
			file.write(eventList.toString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
