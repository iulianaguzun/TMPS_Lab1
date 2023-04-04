package factory_method;

public class SecondYear implements AcademicYear{

  private final String name;
  private final double averageMark;

  public SecondYear(String name, double averageMark) {
    this.name = name;
    this.averageMark = averageMark;
  }

  @Override
  public String getGroupName() {
    return name;
  }

  @Override
  public double getAverageMark() {
    return averageMark;
  }
}
