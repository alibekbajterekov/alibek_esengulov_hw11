public class Skelet extends Druid {
    private String power;



    public Skelet(int health, int damage, Weapon superWeapon, String power) {
        super(health, damage, superWeapon);
        // super.getDruid(health,damage,superWeapon);
        this.power = power;
    }



    public Skelet(int health, int damage, Weapon superWeapon, Druid druid) {
        super(health,damage,superWeapon);
    }

    public String getPower() {
        return power;
    }



    public String printInfo() {
        return " Hp Druid: " + getHealth() + " Druid damage: " + getDamage()+ " Druid weapon: "+getSuperWeapon() ;
        // ПЕРЕЗАПИСЫВАЕМЫЙ МЕТОД
    }


    public final String printInfo(String Sword){
        return " Skeleton Hp: " + getHealth()+ " Skeleton damage: "+ getDamage()+ " Skeleton Weapon: "+ getSuperWeapon()+this.power;
        //НЕ ПЕРЕЗАПИСЫВАЕМЫЙ МЕТОД

    }

    @Override
    public String getDruid(int health, int damage, Weapon superWeapon) {

        return  " Elf Hp: " + getHealth() +" Elf damage: " + getDamage()+ " Elf superpower: "+getSuperWeapon()+ this.power;
    }


}

