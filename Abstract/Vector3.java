

public class Vector3 extends Vector{
	public double y;
	public double z;
	
	@Override
	public double calculateDistance() {
		distance = Math.sqrt((x*x) + (y*y) + (z*z));
		return distance;
	}
	@Override
	public double calculateAraea() {
		area = x*y*z;
		return area;
	}
	@Override
	public void displayArea() {
		System.out.println("Vector3 area is : " + area);
	}
	@Override
	public void displayDistance() {
		System.out.println("Vector3 distance is : " + distance);
	}

}
