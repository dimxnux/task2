public class Main {

    public static void main(String[] args) {
        Grades grade = Grades.EXCELLENT;
        System.out.println("current: " + grade);
        System.out.println("next: " + grade.next());
        System.out.println("previous: " + grade.previous());
        System.out.print("all: ");
        grade.showAll();
    }

}
