package intermediateJavaCodes;
public class WorkingWithClassesAndObjects {
	private String brand;
	private String color;
	private int year; 
	
	public WorkingWithClassesAndObjects (String brand, String color, int year) {
		this.brand = brand;
		this.color = color;
		this.year = year; 
	}
	
	public void accelerate() {
		 System.out.println("The car is accelerating.");
    }

    public void brake() {
        System.out.println("The car is braking.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
    	WorkingWithClassesAndObjects myWorkingWithClassesAndObjects = 
    			new WorkingWithClassesAndObjects("Toyota", "Red", 2022);
    	myWorkingWithClassesAndObjects.accelerate();
    	myWorkingWithClassesAndObjects.brake();
    	myWorkingWithClassesAndObjects.displayInfo();
	}
}
