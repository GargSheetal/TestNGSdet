package testNG.annotations.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
	
	@Test
	public void startCar()
	{
		System.out.println("Car Started");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = {"startCar"}, alwaysRun = true)
	public void driveCar()
	{
		System.out.println("Car Driving");
	}
	
	@Test(dependsOnMethods = {"driveCar"}, alwaysRun = true)
	public void stopCar()
	{
		System.out.println("Car Stopped");
	}
	
	@Test(dependsOnMethods = {"startCar", "driveCar"})
	public void parkCar()
	{
		System.out.println("Car Parked");
	}

}
