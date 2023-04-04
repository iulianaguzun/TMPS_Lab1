package builder;

public class Screen {

  private final int size;

  private final String type;

  public Screen(int size, String type) {
    this.size = size;
    this.type = type;
  }

  public int getSize() {
    return size;
  }

  public String getType() {
    return type;
  }
}
