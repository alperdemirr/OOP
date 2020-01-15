
public class Weapon implements IWeapon{

	public String weaponName;
	public int damage;
	public int ammoMagnetSize;
	public int totalAmmo;
	public int initialAmmoMagnetSize;
	
	@Override
	public void reload() {
		totalAmmo -=initialAmmoMagnetSize;
		ammoMagnetSize = initialAmmoMagnetSize;
	}
	@Override
	public void fire(int anAmmo) {
		
		if (ammoMagnetSize > 0) {
			ammoMagnetSize -=anAmmo;
		}
	}

	@Override
	public void getAmmo(int anAmmo) {
		totalAmmo += anAmmo;	
	}

	
}
