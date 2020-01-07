
public class Car extends Vecihles {

	public String carName;
	public int model;
	
	
	public Car(String name, int rotationPerSecond,String carName, int model) {
		super(name, rotationPerSecond);
		this.carName = carName;
		this.model = model;
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
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
		return super.toString() + " car name : "+ carName + " model : " + model ;
	}

}
