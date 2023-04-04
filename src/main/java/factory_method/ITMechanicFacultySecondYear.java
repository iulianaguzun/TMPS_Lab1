package factory_method;

public class ITMechanicFacultySecondYear implements AcademicFactory{

  @Override
  public AcademicYear getAcademicYear() {
    return new SecondYear("TI-201", 9.0);
  }

}
