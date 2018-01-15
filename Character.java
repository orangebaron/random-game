public abstract class Character {
  int health,maxHealth;
  Position position;
  public Character(int health, Position position) {
    this.health = health;
    this.maxHealth = health;
    this.position = position;
  }

  void kill() { health = 0; }
  void dealDamage(int d) { health -= d; if (health < 0) kill(); }
  void heal(int d) { health += d; if (health > maxHealth) health = maxHealth; }
}
