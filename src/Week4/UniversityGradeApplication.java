package Week4;

public class UniversityGradeApplication {

    public static void main(String[] args) {
        Grade p2 = new Grade(75);//create a grade object
        p2.setPercentage(95);

        System.out.println(p2.getPercentage());
    }
}
