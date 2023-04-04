package factory_method;

public class MainMethod {

  public static void main(String[] args) {
    String requiredYear = "first";

    AcademicFactory academicFactory;
    if (requiredYear.equalsIgnoreCase("first")) {
      academicFactory = new ITMechanicFacultyFirstYear();
    }else {
      academicFactory = new ITMechanicFacultySecondYear();
    }

    AcademicYear academicYear = academicFactory.getAcademicYear();
    System.out.println(academicYear.getGroupName() + " : " + academicYear.getAverageMark());
  }
}
