package Mostenire.Exercitiu6;

import java.util.ArrayList;

public class TeamLeader extends Staff {

    ArrayList<Programator> team;

    public TeamLeader(String name, int salary) {
        super(name, salary);
        team = new ArrayList<>();
    }

    public void assignWork() {
        for (Programator developer : team) {
            developer.code();
        }
    }

    public void addPeopleInTheTeam(Programator programator) {
        team.add(programator);
    }

    @Override
    public String toString() {
        return "TeamLeader{" +
                "team=" + team +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
