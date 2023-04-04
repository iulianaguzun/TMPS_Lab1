package abstract_factory;

public class SamsungFactory implements GadgetFactory{

  @Override
  public Laptop getLaptop() {
    return new SamsungLaptop("Samsung laptop", "Intel i5");
  }

  @Override
  public Smartphone getSmartphone() {
    return new SamsungSmartphone("Samsung smartphone", 7);
  }
}
