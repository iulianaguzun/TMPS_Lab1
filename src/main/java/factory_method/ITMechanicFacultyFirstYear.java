package factory_method;

public class ITMechanicFacultyFirstYear implements AcademicFactory{

  @Override
  public AcademicYear getAcademicYear() {
    return new FirstYear("TI-211", 8.75);
  }
}
