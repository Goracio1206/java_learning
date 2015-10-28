package FacultativDuble2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Vitalii.Nedzelskyi on 27.10.2015.
 */
public class LessonsList {
    private ArrayList<Lesson> lessonsList = new ArrayList<Lesson>();

    public void addLessonsList(Lesson lessonsList) {
        this.lessonsList.add(lessonsList);
    }

    @Override
    public String toString() {
        return "Lessons list: " + "\n";
    }
}
