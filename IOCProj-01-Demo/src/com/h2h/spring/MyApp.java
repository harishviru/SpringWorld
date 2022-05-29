package com.h2h.spring;

/** Here  We are only creating ,instantiating and managing the object . And also 
 *   we are not handling over to Spring IOC container , so that we have to do
 *   every step our own from object creation to object destruction.
 */
public class MyApp {

	public static void main(String[] args) {
		//Create the objec
		Vehicle vehicle =new Car();
		System.out.println(vehicle.horn());
	}
}
