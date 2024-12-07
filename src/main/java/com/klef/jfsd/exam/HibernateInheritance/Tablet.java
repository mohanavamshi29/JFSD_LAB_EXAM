package com.klef.jfsd.exam.HibernateInheritance;
import javax.persistence.Entity;
@Entity
public class Tablet extends Device{
	private double screenSize;
	/**
	 * @return the screenSize
	 */
	public double getScreenSize() {
		return screenSize;
	}
	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	/**
	 * @return the batteryLife
	 */
	public int getBatteryLife() {
		return batteryLife;
	}
	/**
	 * @param batteryLife the batteryLife to set
	 */
	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}
	private int batteryLife;
}
