package Activities;

public class Car {
String color;
String transmission;
int make;
int tyres;
int doors;

Car() {tyres=4;doors=4;}

public void displayCharacteristics() {
	System.out.println("Color of the car is:" +color);
	System.out.println("transmission of the car is:" +transmission);
	System.out.println("make of the car is:" +make);
	System.out.println("number of the tyres of the car is:" +tyres);
	System.out.println("number of the doors of the car is:" +doors);
}
public void accelarate() {
	System.out.println("Car is moving forward.");
}
public void brake() {
	System.out.println("Car has stopped.");
}
}
