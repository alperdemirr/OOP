
public class Vector2 extends Vector{
	
	public double y;
	
	@Override
	public double calculateDistance() {
		distance = Math.sqrt((x*x) + (y*y));
		return distance;
	}

	@Override
	public double calculateAraea() {
		area = x *y;
		return area;
	}

	@Override
	public void displayArea() {
		System.out.println("Vector2 area is : " + area);
	}

	@Override
	public void displayDistance() {
		System.out.println("Vector2 distance is : " + distance);
	}


}