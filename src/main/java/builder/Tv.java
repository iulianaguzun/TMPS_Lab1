package builder;

public class Tv {

  private final String name;

  private final String brand;

  private final String type;

  private final Screen screen;

  public Tv(String name, String brand, String type, Screen screen) {
    this.name = name;
    this.brand = brand;
    this.type = type;
    this.screen = screen;
  }

  public String getName() {
    return name;
  }

  public String getBrand() {
    return brand;
  }

  public String getType() {
    return type;
  }

  public Screen getScreen() {
    return screen;
  }
}
