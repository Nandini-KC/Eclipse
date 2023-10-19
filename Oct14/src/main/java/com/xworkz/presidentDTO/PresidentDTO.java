package com.xworkz.presidentDTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PresidentDTO implements Comparable<PresidentDTO>{
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate durationStart;
	private LocalDate durationEnd;
	@Override
	public int compareTo(PresidentDTO o) {
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((durationEnd == null) ? 0 : durationEnd.hashCode());
		result = prime * result + ((durationStart == null) ? 0 : durationStart.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PresidentDTO other = (PresidentDTO) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (durationEnd == null) {
			if (other.durationEnd != null)
				return false;
		} else if (!durationEnd.equals(other.durationEnd))
			return false;
		if (durationStart == null) {
			if (other.durationStart != null)
				return false;
		} else if (!durationStart.equals(other.durationStart))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
