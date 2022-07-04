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

  public int nyukin(int money){
    this.zandaka += money;
    return this.zandaka;
  }

  public int syukkin(int money){
    if(this.zandaka >= money){
      this.zandaka -= money;
    }else{
      return -1;
    }
    return this.zandaka;
  }

  public int nenri(Double ratio, int years){
    ratio /= 100;
    double nowZandaka = (this.zandaka * ratio + this.zandaka);
    for(int i=1; i < years; i++){
      nowZandaka = (nowZandaka * ratio + nowZandaka);
    }
    return (int)nowZandaka;
  }
}
