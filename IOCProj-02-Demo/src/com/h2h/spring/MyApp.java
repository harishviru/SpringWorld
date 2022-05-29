package com.h2h.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** Here  We are NOT creating ,instantiating and managing the object .
 *   we are  handling over to Spring IOC container , so that we can get objects
 *    from IOC container 
 */
public class MyApp {

	public static void main(String[] args) {
		//Create the IOC Container
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("com/h2h/spring/applicationContext.xml");
		Vehicle vehicle =ctx.getBean("cVehicle",Car.class);
		System.out.println(vehicle.horn());
	}
}
