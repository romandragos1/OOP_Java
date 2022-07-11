package Compozitie.Exercitiu3;

public class Main {

    public static void main(String[] args) {

// Exercitiu 3 - Creati clasa FamilyMember cu fieldurile String name, int age si List<FamilyMember> familyMembers;
// Fiecare familyMember va avea o metoda addMember(FamilyMember member) care va adauga un nou membru al familiei is lista sa;
// De asemenea vom avea metoda printMyFamily() care printeaza toate detaliile familiei fiecarei persoane;
// Testati functionalitatile aplicatiei.

        FamilyMember member1 = new FamilyMember("Dragos", 35);          // Initializam 4 membri ai familiei
        FamilyMember member2 = new FamilyMember("Florina", 32);
        FamilyMember member3 = new FamilyMember("Eugen", 37);
        FamilyMember member4 = new FamilyMember("Liviu", 41);

        member1.addFamilyMember(member2);       // Definim relatiile familiei
        member1.addFamilyMember(member3);
        member1.addFamilyMember(member4);

        member1.printMyFamily();            // Printam la consola membrii familiei primei persoane
        member2.printMyFamily();            // Printam la consola membrii familiei celei de-a doua persoane
    }
}