package semonster2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
  @Test
  public void testUserName() {
    User user = new User("koudai", "oit2022");
    String expected = "koudai";
    assertEquals(expected, user.getUserName());
  }

  @Test
  public void testUserPass() {
    User user = new User("koudai", "oit2022");
    String expected = "oit2022";
    assertEquals(expected, user.getUserPass());
  }

  @Test
  public void testUserZandaka() {
    User user = new User("koudai", "oit2022");
    String expected = "koudai";
    assertEquals(expected, user.getZandaka());
  }

}
