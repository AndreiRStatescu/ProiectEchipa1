package pack;

import com.sun.media.jfxmedia.events.NewFrameEvent;

//Service=doar face chestii, nu tine minte atribute, ia dintr-o parte, da in altul
public class UserService {
	public void register(String username, String password)
	{
		for (User user: Database.users)
		{
			if (user.getUsername().equals(username))
			{
				System.out.println("Userul cu numele "+username+" eixsta deja");
				return;
			}}
			Database.users.add(new User(username, password));
	}
	
	public void login(String username,String password)
	{
		for (User user: Database.users)
		{
			if (user.getUsername().equals(username))
			{
				if (user.getPassword().equals(password))
				{
					System.out.println("Hello, "+username+"!");
				}
				else
				{
					System.out.println("Parola gresita pt user-ul "+"username");
				}
				return;
			}
		}
		System.out.println("Userul "+username+" nu exista");
	}
	
	public void add_friend(String currentUsername, String newFriendUsername)
	{
		for (User user: Database.users)
		{
			if (user.getUsername().equals(currentUsername))
			{
				for (User newFriend : Database.users)
				{
					if(newFriend.getUsername().equals(newFriendUsername))
					{
						if(checkFriendship(user, newFriend))
						{
							System.out.println(String.format("Userul %s este deja prietenul userului %s", currentUsername, newFriendUsername));
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
	public boolean checkFriendship(User currentUsername, User newFriendUsername)
	{
		for (User user : currentUsername.getFriends())
			if(user.getUsername().equals(newFriendUsername.getUsername()))
			{
				return true;
			}
		return false;
	}
}