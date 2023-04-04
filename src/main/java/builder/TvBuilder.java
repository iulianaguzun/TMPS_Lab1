package builder;

public class TvBuilder implements Builder {

  private String name;

  private String brand;

  private String type;

  private Screen screen;

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public void setScreen(Screen screen) {
    this.screen = screen;
  }

  public Tv createTv() {
    return new Tv(name, brand, type, screen);
  }
}
