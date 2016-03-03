package org.ankur.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="FOUR_WHEELER")
//@DiscriminatorValue("CAR")
public class FourWheeler extends Vehicle {
	
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
	
}
