package academy.learnprogramming;

// Encapsulation Lesson - YES, members are contained (private)
public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        // validation, only values we're accepting
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Game Over");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return this.health;
    }
}
