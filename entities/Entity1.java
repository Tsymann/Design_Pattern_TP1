package com.tactfactory.designpatternniveau1.singleton.tp1.entities;

public class Entity1 {
  private long id;
  private String data;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Entity1 [id=" + id + ", data=" + data + "]";
  }
}
