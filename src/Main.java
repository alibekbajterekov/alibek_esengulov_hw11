public class Main {
    public static void main(String[] args) {
        // Elf objectA = new Elf(200, 50, Weapon.WEAPON," Fire");

        Skelet objectA = new Skelet(500, 50, Weapon.WEAPON, " Gang"){};
        Elf objectB = new Elf( 400, 40,Weapon.WEAPON," Cast ");
        Skelet objectC = new Skelet(300,30,Weapon.WEAPON," Berserk ");

        System.out.println(objectA.printInfo()); //Перезаписываемый первый
        System.out.println(objectB.printInfo());//Перезаписываемый
        System.out.println(objectC.printInfo());                    //второй
        System.out.println(objectA.printInfo(" frost")); //Не перезаписываемый

    }
}

