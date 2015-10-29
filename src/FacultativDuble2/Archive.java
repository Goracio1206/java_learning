package FacultativDuble2;

import java.util.ArrayList;

/**
 * Created by Vitalii.Nedzelskyi on 29.10.2015.
 */
public class Archive {
    private ArrayList<Lesson> archive = new ArrayList<Lesson>();

    public void addToArchive(Lesson lesson) {
        archive.add(lesson);
    }

    private String print() {
        StringBuilder st = new StringBuilder();
        for (Lesson elem : archive) {

            st.append(elem.toString() + "\n");
        }
        return st.toString();
    }

    @Override
    public String toString() {
        return print();
    }
}
