public class Main {
    public static void main(String[] args) {
        Weapon weapon=new Weapon();
        weapon.setName("gun");
        weapon.setWeaponType(WeaponType.GUN);
        Boss boss=new Boss();
        boss.setHealth(600);
        boss.setDamage(50);
        boss.setWeapon(weapon);
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + weapon.getName() + " " + weapon.getWeaponType() );
    }
}