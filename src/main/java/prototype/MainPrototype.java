package prototype;

import java.util.ArrayList;
import java.util.List;

public class MainPrototype {

  public static void main(String[] args) {
    List<Cosmetic> boughtProducts = new ArrayList<>();

    Cosmetic product1 = new Gloss("Hydra", "Kiko");
    Cosmetic product2 = new Blush("Light", "Nyx");

    boughtProducts.add(product1);
    boughtProducts.add(product2);

    boughtProducts.add(product1.clone());

    for (Cosmetic product : boughtProducts) {
      System.out.println(product.getName() + " : " + product.getBrand());
    }
  }
}
