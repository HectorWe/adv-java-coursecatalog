package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course {

    String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String toString() {
        return String.format("\nCourse: %s\n- Number: %s\n- Credits: %s\n- Prerequisites: %s", getCourseName(), getCourseNumber(), getCredits(), getPrerequisites());
    }

}
