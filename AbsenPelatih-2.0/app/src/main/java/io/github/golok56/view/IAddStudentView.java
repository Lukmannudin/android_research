package io.github.golok56.view;

import java.util.ArrayList;

import io.github.golok56.object.Student;
import io.github.golok56.view.base.IBaseView;

/**
 * Interface that {@link io.github.golok56.view.activity.AddStudentActivity} need to implement.
 * So it can interact with the corresponding presenter.
 *
 * @author Satria Adi Putra
 */
public interface IAddStudentView extends IBaseView {

    /**
     *
     */
    boolean hasEmptyEditText();

    /**
     *
     */
    ArrayList<Student> getStudents();

    /**
     *
     */
    void showSchoolMenu();

    /**
     *
     */
    void setupForm();

}
