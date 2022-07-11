package Compozitie.Exercitiu8;

public class Enemy {

    String name;
    int health;
    int attack;
    Hero enemy;

    public Enemy(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void setEnemy(Hero hero) {
        this.enemy = hero;
    }

    public void attack() {
        if (enemy != null) {
            enemy.health -= this.attack;
            System.out.println("Am atacat inamicul " + enemy);
        } else {
            System.out.println("Nu avem nici un Hero inamic");
        }
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", enemy=" + enemy.name +
                '}';
    }
}
