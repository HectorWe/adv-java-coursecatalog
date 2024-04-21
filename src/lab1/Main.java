package lab1;

public class Main {

    public static void main(String[] args) {

        // Advance Java Course
        Course advancedJavaCourse = new AdvancedJavaCourse("Advanced Java Programming", "AJC001");
        advancedJavaCourse.setCredits(4.0);
        advancedJavaCourse.setPrerequisites("Introduction Java Course");

        // Introduction Java Course
         Course introJavaCourse = new IntroJavaCourse("Introduction Java Course", "IJC001");
         introJavaCourse.setCredits(3.0);
         introJavaCourse.setPrerequisites("Introduction to Programming Course");

         // Introduction to Programming Course
        Course introToProgramming = new IntroJavaCourse("Introduction to Programming Course", "IPC001");
        introToProgramming.setCredits(2.0);
        introToProgramming.setPrerequisites("Basics Computer Skills");

        courseDetails(advancedJavaCourse);
        courseDetails(introJavaCourse);
        courseDetails(introToProgramming);

    }

    public static void courseDetails(Course course) {
        System.out.println("\nCourse: " + course.getCourseName());
        System.out.println("- Number: " + course.getCourseNumber());
        System.out.println("- Credits: " + course.getCredits());
        System.out.println("- Prerequisites: " + course.getPrerequisites());
    }
}
