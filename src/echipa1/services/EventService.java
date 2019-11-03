package echipa1.services;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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

			eventList.add(eventObject);

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

	public void loadJson(String filename) {
		// JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();

		try (FileReader reader = new FileReader(filename)) {
			// Read JSON file
			Object obj = jsonParser.parse(reader);

			org.json.simple.JSONArray eventList = (org.json.simple.JSONArray) obj;
			System.out.println(eventList);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
