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
    int expected = 0;
    assertEquals(expected, user.getZandaka());
  }

  @Test
  public void testNyukin() {
    User user = new User("koudai", "oit2022");
    int expected = 100;
    assertEquals(expected, user.nyukin(100));
  }

  @Test
  public void testSyukkin() {
    User user = new User("koudai", "oit2022");
    user.nyukin(200);
    int expected = 100;
    assertEquals(expected, user.syukkin(100));
    expected = -1;
    assertEquals(expected, user.syukkin(200));
  }

}
