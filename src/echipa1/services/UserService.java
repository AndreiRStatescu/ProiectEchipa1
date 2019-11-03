package echipa1.services;

import echipa1.Database;
import echipa1.models.Events;
import echipa1.models.User;

//Service=doar face chestii, nu tine minte atribute, ia dintr-o parte, da in altul
public class UserService {
	public void register(String username, String password, String adresaMail, String numarTelefon) {
		for (User user : Database.users) {
			if (user.getUsername().equals(username)) {
				System.out.println("Userul cu numele " + username + " exista deja");
				return;
			}
		}
		Database.users.add(new User(username, password, adresaMail, numarTelefon));
	}

	public void login(String username, String password) {
		for (User user : Database.users) {
			if (user.getUsername().equals(username)) {
				if (user.getPassword().equals(password)) {
					System.out.println("Hello, " + username + "!");
				} else {
					System.out.println("Parola gresita pt user-ul " + "username");
				}
				return;
			}
		}
		System.out.println("Userul " + username + " nu exista");
	}
	public void show_user (String username) {
		for (User user : Database.users) {
			if (user.getUsername().equals(username)) {
				System.out.println("Username: " + user.getUsername() + "Email" + user.getAdresaMail() + "Nr. Telefon" + user.getNumarTelefon() );
				return;
			}
			System.out.println(String.format("Userul %s nu exista", username));
			return;
	}
	}
	public void add_friend(String currentUsername, String newFriendUsername) {
		for (User user : Database.users) {
			if (user.getUsername().equals(currentUsername)) {
				for (User newFriend : Database.users) {
					if (newFriend.getUsername().equals(newFriendUsername)) {
						if (checkFriendship(user, newFriend)) {
							System.out.println(String.format("Userul %s este deja prietenul userului %s",
									currentUsername, newFriendUsername));
							return;
						}
						user.getFriends().add(newFriend);
						System.out.println(user.getFriends());
						return;
					}
				}
				System.out.println(String.format("Userul %s nu exista", newFriendUsername));
				return;
			}
		}
		System.out.println(String.format("Userul %s nu exista", currentUsername));
	}

	public boolean checkFriendship(User currentUsername, User newFriendUsername) {
		for (User user : currentUsername.getFriends())
			if (user.getUsername().equals(newFriendUsername.getUsername())) {
				return true;
			}
		return false;
	}

	public void delete_friend(String currentUsername, String deletedFriend) {
		for (User user : Database.users) {
			if (user.getUsername().equals(currentUsername)) {
				for (User deletedUser : Database.users) {
					if (deletedUser.getUsername().equals(deletedFriend)) {
						if (checkFriendship(user, deletedUser) == false) {
							System.out.println(String.format("Userul %s nu este prieten cu userul %s", currentUsername,
									deletedFriend));
							return;
						}
						user.getFriends().remove(deletedUser);
						System.out.println(user.getFriends());
						return;
					}
				}
				System.out.println(String.format("Userul %s nu exista", deletedFriend));
				return;
			}
		}
		System.out.println(String.format("Userul %s nu exista", currentUsername));
	}

	public void organizeEvent(String username, String eventname, String eventdate, String eventlocation) {
		User organizer = isUserInDatabase(username);
		if (organizer != null) {
			for (Events event : Database.events) {
				if (event.getEventlocation().equals(eventlocation) && event.getEventdate().equals(eventdate)) {
					System.out.println("There is already an event organized for this date");
					return;
				}
			}
			Database.events.add(new Events(eventname, eventdate, eventlocation, username));
			System.out.println(username + " added \"" + eventname + "\" on " + eventdate + " at " + eventlocation);
		}
		System.out.println("Please register to create the event");
	}

	public void joinEvent(String eventname, String eventdate, String eventlocation, String participantname) {
		User participant = isUserInDatabase(participantname);
		if (participant != null) {
			for (Events event : Database.events) {
				if (event.getEventlocation().equals(eventlocation) && event.getEventdate().equals(eventdate)
						&& event.getEventname().equals(eventname)) {
					if (checkEventOrganizer(event, participantname)) {
						System.out.println("You are the organizer of this event");
					} else {
						event.getParticipants().add(participant);
						System.out.println("Participant added to the \"" + eventname + "\" event");
					}
					return;
				}
			}
			System.out.println("We could not find this event. :(");
		}
		System.out.println("Please register to join the event");
	}

	private boolean checkEventOrganizer(Events event, String participantname) {
		if (event.getEventorganizer().equals(participantname)) {
			return true;
		}
		return false;
	}

	private User isUserInDatabase(String username) {
		for (User user : Database.users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
}