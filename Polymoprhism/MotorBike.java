
public class MotorBike extends Vecihles{
	
	public String motorName;
	public int model;
	
	public MotorBike(String engineName, int rotationPerSecond,String motorName, int model) {
		super(engineName, rotationPerSecond);
		this.motorName = motorName;
		this.model = model;
	}

	public String getMotorName() {
		return motorName;
	}

	public void setMotorName(String motorName) {
		this.motorName = motorName;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " motor name : "+ motorName + " model : " + model ;
	}
}
