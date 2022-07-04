package semonster2;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<User> users_data = new ArrayList<User>();

    public void addUser(User user){
        users_data.add(user);
    }
}
