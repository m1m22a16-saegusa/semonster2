package semonster2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DataTest {
  @Test
  public void testUserAdd() {
    Data data = new Data();
    User user = new User("koudai", "oit2022");
    int expected = 1;
    assertEquals(expected, data.addUser(user));
  }

  @Test
  public void testUserDelete() {
    Data data = new Data();
    User user1 = new User("koudai", "oit2022");
    User user2 = new User("daikou", "oit2022");
    User user3 = new User("Osaka", "oit2022");

    data.addUser(user1);
    data.addUser(user2);
    data.addUser(user3);
  }
}
