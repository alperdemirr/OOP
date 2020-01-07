
public class Vecihles {

	public String engineName;
	public int rotationPerSecond;
	
	public Vecihles(String engineName,int rotationPerSecond) {
		this.engineName = engineName;
		this.rotationPerSecond =rotationPerSecond;
	}

	public String getName() {
		return engineName;
	}

	public void setName(String engineName) {
		this.engineName = engineName;
	}

	public int getRotationPerSecond() {
		return rotationPerSecond;
	}

	public void setRotationPerSecond(int rotationPerSecond) {
		this.rotationPerSecond = rotationPerSecond;
	}
	
	@Override
	public String toString() {
		
		return "Engine Name : " +engineName + "Rotation Per Second : " + rotationPerSecond;
	}
	
}
