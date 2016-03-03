package org.ankur.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TWO_WHEELER")
//@DiscriminatorValue("BIKE")
public class TwoWheeler extends Vehicle {
	
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
}
