package Compozitie.Exercitiu9;

public class Main {

    public static void main(String[] args) {

// Exercitiu 9 - Creati clasa Elev cu proprietatile String name, ArrayList<Integer> note;
// Creati clasa Profesor cu proprietatile String name, ArrayList<Elev> elevi, metoda addGrade(int index, int grade) care
// seteaza nota grade studentului de pe pozitia index din lista interna de elevi si meotda calculeazaMediile() care
// calculeaza si printeaza mediile tuturor elevilor acestuia.

        Profesor profesor = new Profesor("Palade Marian");      // Cream un profesor si 3 elevi
        Elev elev1 = new Elev("Pandele Monica");
        Elev elev2 = new Elev("Rotaru Paul");
        Elev elev3 = new Elev("Negru Roxana");

        elev1.note.add(9);      // Adaugam cate 3 note fiecarui elev
        elev1.note.add(8);
        elev1.note.add(7);
        elev2.note.add(7);
        elev2.note.add(8);
        elev2.note.add(9);
        elev3.note.add(10);
        elev3.note.add(9);
        elev3.note.add(9);

        profesor.addStudent(elev1);     // Trecem elevii in structura profesorului
        profesor.addStudent(elev2);
        profesor.addStudent(elev3);

        profesor.calculeazaMediaElevilor();     // Profesorul calculeaza media elevilor
    }
}