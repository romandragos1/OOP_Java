package Compozitie.Exercitiu8;

public class Hero {

    String name;
    int health;
    int attack;
    Enemy enemy;

    public Hero(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void attack() {
        if (enemy != null) {
            enemy.health -= this.attack;
            System.out.println("Am atacat inamicul " + enemy);
        } else {
            System.out.println("Nu avem nici un Enemy inamic");
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", enemy=" + enemy.name +
                '}';
    }
}
