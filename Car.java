package com.popquiz;

public class Car extends Vehicle {
	
	protected int numSeats = 0;
	protected int numWindows = 0;
	protected boolean isRunning = true;
	protected int numOfAirBags = 0;
	protected boolean hasEngine = true;
	
	

	public Car(int price, String color, int numSeats, int numWindows, boolean isRunning, int numOfAirBags,
			boolean hasEngine) {
		super(price, color);
		this.numSeats = numSeats;
		this.numWindows = numWindows;
		this.isRunning = isRunning;
		this.numOfAirBags = numOfAirBags;
		this.hasEngine = hasEngine;
	}
	
	

	public Car() {
		
	}



	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public int getNumWindows() {
		return numWindows;
	}

	public void setNumWindows(int numWindows) {
		this.numWindows = numWindows;
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public int isNumOfAirBags() {
		return numOfAirBags;
	}

	public void setNumOfAirBags(int numOfAirBags) {
		this.numOfAirBags = numOfAirBags;
	}

	public boolean isHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}
	
	public void newCar()
	{
		System.out.println("Hi I am a new car");
	}
	
	public void thisCarIsSpeeding()
	{
		System.out.println("You are speeding please be careful");
	}

}
