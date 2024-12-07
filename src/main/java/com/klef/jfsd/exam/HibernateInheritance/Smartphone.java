package com.klef.jfsd.exam.HibernateInheritance;
import javax.persistence.Entity;
@Entity
public class Smartphone extends Device{
	private String operatingSystem;
    /**
	 * @return the operatingSystem
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}
	/**
	 * @param operatingSystem the operatingSystem to set
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	/**
	 * @return the cameraResolution
	 */
	public int getCameraResolution() {
		return cameraResolution;
	}
	/**
	 * @param cameraResolution the cameraResolution to set
	 */
	public void setCameraResolution(int cameraResolution) {
		this.cameraResolution = cameraResolution;
	}
	private int cameraResolution;
}
