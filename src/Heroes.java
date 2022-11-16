public class Heroes {
    private int health;
    private int damage;
    private String heroesAttackType;

    public Heroes(String name, int damage, int health){
        this.health = health;
        this.damage = damage;
    }
    public Heroes(int health, int damage) {
        this.damage = damage;
        this.health = health;
    }
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
    public String getHeroesAttackType(){
        return heroesAttackType;
    }
}
