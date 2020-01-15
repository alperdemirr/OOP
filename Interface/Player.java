
public class Player implements IPlayer,IHealthBar{

	public String playerName;
	public int health;
	public Weapon weapon;
	/*region player actions*/
	@Override
	public void run() {
		System.out.println("Run run run");
	}

	@Override
	public void walk() {
		System.out.println("walk walk walk");
	}

	@Override
	public void turnLeft() {
		System.out.println("turn position to left.");
	}

	@Override
	public void turnRight() {
		System.out.println("turn position to right");
	}

	@Override
	public void gearWeapon() {
		if (weapon != null) {
			System.out.println("gun is active");
		}
	}
	/*endregion player actions*/
	
	/*region Health Manager*/
	@Override
	public void increaseHealth(int aHealth) {
		health +=aHealth;	
		System.out.println("health : "+ health);
	}
	@Override
	public void deacreseHealth(int aDamage) {
		if (health>0) {
			health -=aDamage;
		}
		System.out.println("health : "+ health);
	}
	/*endregion Health Manager*/
	
}
