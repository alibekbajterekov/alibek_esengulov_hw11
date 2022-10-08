public abstract class Druid {
    private Integer health;
    private Integer damage;
    private Weapon superWeapon;


    public abstract String getDruid(int health, int damage, Weapon superWeapon);


    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public Weapon getSuperWeapon() {
        return superWeapon;
    }

    public Druid(int health, int damage, Weapon superWeapon) {
        this.health = health;
        this.damage = damage;
        this.superWeapon = superWeapon;

    }


}
