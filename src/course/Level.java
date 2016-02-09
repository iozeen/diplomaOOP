package course;


public enum Level {
    Elementary(60), PreIntermediate(65), Intermediate(65), UpperIntermediate(65), Advanced(65);

    private int numberLessons;

    Level(int numberLessons) {
        this.numberLessons = numberLessons;
    }

    public int getNumberLessons() {
        return numberLessons;
    }

    public void setNumberLessons(int numberLessons) {
        this.numberLessons = numberLessons;
    }
}
