package prototype;

public class Gloss implements Cosmetic {

  private final String name;

  private final String brand;

  public Gloss(String name, String brand) {
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
    return new Gloss(this.name, this.brand);
  }
}
