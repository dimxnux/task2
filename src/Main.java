public class Main {

    public static void main(String[] args) {
        Grades grade = Grades.EXCELLENT;
        System.out.println(grade.next());
        System.out.println(grade.previous());
        grade.showAll();
    }

}
