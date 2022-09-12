import java.util.Arrays;

public enum Grades {
    EXCELLENT,
    VERY_GOOD,
    GOOD,
    ACCEPTABLE,
    BASIC,
    FAIL;

    public Grades next() {
        int nextValueIndex = ordinal() + 1;
        Grades[] values = Grades.values();

        if (nextValueIndex == values.length) {
            return values[0];
        }

        return values[nextValueIndex];
    }

    public Grades previous() {
        int previousValueIndex = ordinal() - 1;
        Grades[] values = Grades.values();

        if (previousValueIndex == -1) {
            return values[values.length - 1];
        }

        return values[previousValueIndex];
    }

    public void showAll() {
        System.out.println(Arrays.toString(values()));
    }

}
