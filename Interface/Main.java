
public class Main {

	public static void main(String[] args) {
		
		Weapon colt = new Weapon();
		colt.ammoMagnetSize = 0;
		colt.damage = 25;
		colt.initialAmmoMagnetSize = 30;
		colt.totalAmmo = 300;
		colt.weaponName = "colt";
		
		Player player1 = new Player();
		player1.health =100;
		player1.playerName = "Alper Demir";
		player1.weapon = colt;

		System.out.println("is player1 weapon's magnet has ammo ? Ammo:" + player1.weapon.ammoMagnetSize);
		System.out.println("remain Ammo :"+ player1.weapon.totalAmmo);
		
		player1.weapon.reload();
		System.out.println("player1 weapon's magnet has ammo.\nWe can fight. Ammo:" + player1.weapon.ammoMagnetSize);
		System.out.println("remain Ammo :"+ player1.weapon.totalAmmo);
		player1.run();
		player1.walk();
		player1.weapon.fire(10);
		System.out.println("Magnet Ammo:" + player1.weapon.ammoMagnetSize);
		System.out.println("remain Ammo :"+ player1.weapon.totalAmmo);
		player1.turnLeft();
		
		
		player1.deacreseHealth(10);
		player1.run();
		player1.increaseHealth(20);
	}

}
