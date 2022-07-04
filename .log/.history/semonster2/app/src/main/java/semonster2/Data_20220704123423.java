package semonster2;

import java.util.ArrayList;
import java.util.List;

public class Data {
  private List<User> users_data = new ArrayList<User>();

  public int deleteUser(User user) {
    users_data.remove(users_data.indexOf(user));
    return users_data.size();
  }

}
