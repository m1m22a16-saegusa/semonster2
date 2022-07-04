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
      
    }
}
