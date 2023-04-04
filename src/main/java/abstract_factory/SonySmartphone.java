package abstract_factory;

public class SonySmartphone implements Smartphone{

  private final String name;
  private final int screenDimension;

  public SonySmartphone(String name, int screenDimension) {
    this.name = name;
    this.screenDimension = screenDimension;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getScreenDimension() {
    return screenDimension;
  }
}
