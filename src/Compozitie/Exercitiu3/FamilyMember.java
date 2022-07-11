package Compozitie.Exercitiu3;

import java.util.ArrayList;

public class FamilyMember {

    String name;
    int age;
    ArrayList<FamilyMember> familyMembers;

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
        this.familyMembers = new ArrayList<>();
    }

    public void addFamilyMember(FamilyMember familyMember) {
        this.familyMembers.add(familyMember);
        familyMember.familyMembers.add(this);
    }

    public void printMyFamily() {
        for (FamilyMember member : familyMembers) {
            System.out.println(member);
        }
    }

    @Override
    public String toString() {
        return "FamilyMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
