package semonster2;

import java.util.ArrayList;
import java.util.List;

public class Data {
  private List<User> users_data = new ArrayList<User>();

  public int deleteUser(User user) {
    if users_data.size() >= 
    users_data.remove(users_data.indexOf(user));
    return users_data.size();
  }

  public int addUser(User user){
    users_data.add(user);
    return users_data.size();
  }

}
