package builder;

public class Director {
  public void createLedTv(Builder builder){
    builder.setName("Samsung neo");
    builder.setBrand("Samsung");
    builder.setType("Led");
    builder.setScreen(new Screen(81, "FullHD"));
  }

  public void createSmartTv(Builder builder) {
    builder.setName("Sony mx1");
    builder.setBrand("Sony");
    builder.setType("Smart");
    builder.setScreen(new Screen(110, "4K"));
  }
}
