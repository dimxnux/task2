import java.util.Arrays;

public enum Grades {
    EXCELLENT {
        @Override
        public Grades next() {
            return VERY_GOOD;
        }

        @Override
        public Grades previous() {
            return FAIL;
        }
    },
    VERY_GOOD {
        @Override
        public Grades next() {
            return GOOD;
        }

        @Override
        public Grades previous() {
            return EXCELLENT;
        }
    },
    GOOD {
        @Override
        public Grades next() {
            return ACCEPTABLE;
        }

        @Override
        public Grades previous() {
            return VERY_GOOD;
        }
    },
    ACCEPTABLE {
        @Override
        public Grades next() {
            return BASIC;
        }

        @Override
        public Grades previous() {
            return GOOD;
        }
    },
    BASIC {
        @Override
        public Grades next() {
            return FAIL;
        }

        @Override
        public Grades previous() {
            return ACCEPTABLE;
        }
    },
    FAIL {
        @Override
        public Grades next() {
            return EXCELLENT;
        }

        @Override
        public Grades previous() {
            return BASIC;
        }
    };

    public abstract Grades next();

    public abstract Grades previous();

    public void showAll() {
        System.out.println(Arrays.toString(values()));
    }

}
