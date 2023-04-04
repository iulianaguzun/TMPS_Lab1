package abstract_factory;

public class SonyFactory implements GadgetFactory{

  @Override
  public Laptop getLaptop() {
    return new SonyLaptop("Sony Laptop", "AMD Ryzen 5");
  }

  @Override
  public Smartphone getSmartphone() {
    return new SonySmartphone("Sony smartphone", 6);
  }
}
