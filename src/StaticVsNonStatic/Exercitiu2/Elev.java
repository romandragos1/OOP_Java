package StaticVsNonStatic.Exercitiu2;

public class Elev {

    String name;
    int grade;

    static String school;

    public Elev(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public static void changeSchoolName(String newName){
        school = newName;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", school=" + school +         // Adaugam scoala
                '}';
    }
}
