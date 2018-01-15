public abstract class Character {
  public final int maxHealth;
  private int health;
  public final Sprite sprite;
  Position position;
  public Character(int health, Position position, Sprite sprite) {
    this.health = health;
    this.maxHealth = health;
    this.position = position;
    this.sprite = sprite;
  }

  void kill() { health = 0; }
  void dealDamage(int d) { health -= d; if (health < 0) kill(); }
  void heal(int d) { health += d; if (health > maxHealth) health = maxHealth; }
  int getHealth() { return health; }
}
