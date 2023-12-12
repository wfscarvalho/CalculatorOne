public class Student {
    String name;
    double grade1;
    double grade2;
    double grade3;

    double endYearGrade;
    public double FinalGrade(){
        endYearGrade= grade1+grade2+grade3;

        return endYearGrade;
    }

    public String EndYearResult(){
        if (endYearGrade>60.0){
            return "PASS";
        } else {

            double missing=60-endYearGrade;
            return "FAILED\n MISSING "+missing+"POINTS\n\n";
        }
    }
}
