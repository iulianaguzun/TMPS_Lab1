package abstract_factory;

public class SamsungLaptop implements Laptop{
  private final String name;
  private final String cpu;

  public SamsungLaptop(String name, String cpu) {
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
