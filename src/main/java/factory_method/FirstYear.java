package factory_method;

public class FirstYear implements AcademicYear{

  private final String groupName;
  private final double averageMark;

  public FirstYear(String groupName, double averageMark) {
    this.groupName = groupName;
    this.averageMark = averageMark;
  }

  @Override
  public String getGroupName() {
    return groupName;
  }

  @Override
  public double getAverageMark() {
    return averageMark;
  }
}
