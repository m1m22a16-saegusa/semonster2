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

  public int sendUser(String user1, String user2, int money){
    int flag1 = -1;
    int flag2 = -1;
    for(int i = 0; i <= users_data.size(); i++){
      if(users_data.get(i).getUserName() == user1){
        flag1 = i;
      }
      if(users_data.get(i).getUserName() == user2){
        flag2 = i;
      }
      users_data.get(flag1).syukkin(money);
      users_data.get(flag2).nyukin(money);
    }
    if(flag1 == -1 || flag2 == -1){
      return -1;
    }
    if(users_data.get(flag1).getZandaka() < money){
      return -1;
    }
    return 1;
  }
}
