package Chapter6.Inner;

/**
 * Created by Vitalii.Nedzelskyi on 12.11.2015.
 */
public class Student {
    private int id;
    private ExamResult[] exams;

    public Student(int id) {
        this.id = id;
    }

    private class ExamResult {
        private String name;
        private int mark;
        private boolean passed;

        public ExamResult(String name) {
            this.name = name;
            passed = false;
        }

        public void passExam() {
            this.passed = true;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }

        public int getMark() {
            return this.mark;
        }

        public int getPassedMark() {
            final int PASSED_MARK = 4;
            return PASSED_MARK;
        }

        public String getName() {
            return name;
        }

        public boolean isPassed() {
            return passed;
        }
    }

    public void setExams(String[] name, int[] marks) {
        if (name.length != marks.length)
            throw new IllegalArgumentException();
        exams = new ExamResult[name.length];
        for (int i = 0; i < name.length; i++) {
            exams[i] = new ExamResult(name[i]);
            exams[i].setMark(marks[i]);
            if (exams[i].getMark() >= exams[i].getPassedMark())
                exams[i].passExam();
        }
    }

    @Override
    public String toString() {
        String res = "Student: " + id + "\n";
        for (int i = 0; i <exams.length ; i++) {
            if (exams[i].isPassed()) {
                res += exams[i].getName() + ": " + exams[i].getMark() + " - passed." + "\n";
            }
            else {
                res += exams[i].getName() + ": " + exams[i].getMark() + " - passed." + "\n";
            }
        }
        return res;
    }
}
