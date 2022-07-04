package semonster2;

import java.util.ArrayList;
import java.util.List;

public class Data {
  private List<User> users_data = new ArrayList<User>();

  public int deleteUser(User user) {
    if (users_data.size() <= 0) {
      return -1;
    }
    users_data.remove(users_data.indexOf(user));
    return users_data.size();
  }

  public int addUser(User user) {
    users_data.add(user);
    return users_data.size();
  }

  public int sendUser(User user1, User user2, int money){
    if(user1.getZandaka() < money){
      return -1;
    }
    user1.syukkin(money);
    user2.nyukin(money);
    return 1;
  }
}
