package OverloadingVsOverriding.Exercitiu4;

public class AzimutVision {

    public void pass(String studentName) {
        System.out.println("Studentul " + studentName + " a absolvit cursurile AzimutVision");
    }

    public void pass(String... studentsName) {
        for (String studentName : studentsName) {
            System.out.println("Studentul " + studentName + " a absolvit cursurile AzimutVision");
        }
    }
}
