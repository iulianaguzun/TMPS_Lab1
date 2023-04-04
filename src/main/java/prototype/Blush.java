package prototype;

public class Blush implements Cosmetic {

  private final String name;

  private final String brand;

  public Blush(String name, String brand) {
    this.name = name;
    this.brand = brand;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getBrand() {
    return brand;
  }

  @Override
  public Cosmetic clone() {
    return new Blush(this.name, this.brand);
  }

}
