package course;


public enum Level {
    Elementary(60), PreIntermediate(65), Intermediate(65), UpperIntermediate(65), Advanced(65);
    private static final int NumberOfLessons = 12;
    private int costOneLesson;

    Level(int costLevel) {
        this.costOneLesson = costLevel;
    }

    public int getCostOneLesson() {
        return costOneLesson;
    }

    public static int getNumberOfLessons() {
        return NumberOfLessons;
    }


    public void setCostOneLesson(int costLevel) {
        this.costOneLesson = costLevel;
    }
}
//