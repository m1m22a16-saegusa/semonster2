package semonster2;

public class User {
  private int zandaka = 0;
  private String name;
  private String pass;

  public User(String name, String pass) {
    this.name = name;
    this.pass = pass;
  }

  public String getUserName() {
    return this.name;
  }

  public String getUserPass() {
    return this.pass;
  }

  public int getZandaka() {
    return this.zandaka;
  }

}
