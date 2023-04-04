package builder;

public class MainBuilder {

  public static void main(String[] args) {
    Director director = new Director();

    TvBuilder builder = new TvBuilder();
    director.createLedTv(builder);

    Tv tv = builder.createTv();

    System.out.println(tv.getName() + " : " + tv.getBrand());
    System.out.println(tv.getType());
    System.out.println(tv.getScreen().getType() + " : " + tv.getScreen().getSize());
  }

}
