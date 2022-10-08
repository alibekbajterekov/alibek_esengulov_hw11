public final class Elf extends Druid {
    private String superpower;

    public String getPower() {
        return superpower;
    }

    public Elf(int health, int damage, Weapon superWeapon,String superpower) {
        super(health, damage, superWeapon);

        this.superpower = superpower;
    }


    public String printInfo(){
        return  " Elf Hp: " + getHealth() +" Elf damage: " + getDamage()+ " Elf superpower: "+getSuperWeapon()+ superpower;
    }


    @Override
    public String getDruid(int health, int damage, Weapon superWeapon) {
        System.out.println();
        return " "+ getHealth() + getDamage() + getSuperWeapon()+ superpower;
    }


}
