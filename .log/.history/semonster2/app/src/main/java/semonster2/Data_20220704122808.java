package semonster2;

import java.util.ArrayList;
import java.util.List;

public class Data {
  private List<User> users_data = new ArrayList<User>();

  public void deleteUser(User user) {
    del_user = user.getUserName();
    users_data.remove(users_data.indexOf(del_user));
  }

}
