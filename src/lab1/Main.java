package lab1;

public class Main {

    public static void main(String[] args) {

        // Advance Java Course
        AdvancedJavaCourse advancedJavaCourse = new AdvancedJavaCourse("Advanced Java Programming", "AJC001");
        advancedJavaCourse.setCredits(4.0);
        advancedJavaCourse.setPrerequisites("Introduction Java Course");

        // Introduction Java Course
        IntroJavaCourse introJavaCourse = new IntroJavaCourse("Introduction Java Course", "IJC001");
        introJavaCourse.setCredits(3.0);
        introJavaCourse.setPrerequisites("Introduction to Programming Course");

         // Introduction to Programming Course
        IntroJavaCourse introToProgramming = new IntroJavaCourse("Introduction to Programming Course", "IPC001");
        introToProgramming.setCredits(2.0);
        introToProgramming.setPrerequisites("Basics Computer Skills");

        System.out.println(advancedJavaCourse);
        System.out.println(introJavaCourse);
        System.out.println(introToProgramming);
    }
}
