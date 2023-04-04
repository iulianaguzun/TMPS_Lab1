package abstract_factory;

public class SonyLaptop implements Laptop{

  private final String name;
  private final String cpu;

  public SonyLaptop(String name, String cpu) {
    this.name = name;
    this.cpu = cpu;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getCpu() {
    return cpu;
  }
}
