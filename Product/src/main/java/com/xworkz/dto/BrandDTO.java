package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BrandDTO {
	
	private int id;
	private String name;
	private int gstNo;
	private AddressDTO address;
	private int estFrom;
	public BrandDTO(int id, String name, int gstNo, AddressDTO address, int estFrom) {
		super();
		this.id = id;
		this.name = name;
		this.gstNo = gstNo;
		this.address = address;
		this.estFrom = estFrom;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + estFrom;
		result = prime * result + gstNo;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BrandDTO other = (BrandDTO) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (estFrom != other.estFrom)
			return false;
		if (gstNo != other.gstNo)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
