package abstract_factory;

public class MainAbstract {

  public static void main(String[] args) {
    String requiredType = "samsung";
    GadgetFactory factory;

    if (requiredType.equalsIgnoreCase("sony")) {
      factory = new SonyFactory();
    }else {
      factory = new SamsungFactory();
    }

    Laptop laptop = factory.getLaptop();
    Smartphone smartphone = factory.getSmartphone();

    System.out.println(laptop.getName() + " : " + laptop.getCpu());
    System.out.println(smartphone.getName() + " : " + smartphone.getScreenDimension());
  }
}
