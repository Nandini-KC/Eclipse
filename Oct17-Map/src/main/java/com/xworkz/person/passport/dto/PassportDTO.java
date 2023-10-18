package com.xworkz.person.passport.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PassportDTO implements Comparable<PassportDTO>{
	private int id;
	private String no;
	private LocalDate issuedDate;
	private String issuedBy;
	private LocalDate expireDate;
	private PassportType type;
	@Override
	public int compareTo(PassportDTO o) {
		
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expireDate == null) ? 0 : expireDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((issuedBy == null) ? 0 : issuedBy.hashCode());
		result = prime * result + ((issuedDate == null) ? 0 : issuedDate.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		PassportDTO other = (PassportDTO) obj;
		if (expireDate == null) {
			if (other.expireDate != null)
				return false;
		} else if (!expireDate.equals(other.expireDate))
			return false;
		if (id != other.id)
			return false;
		if (issuedBy == null) {
			if (other.issuedBy != null)
				return false;
		} else if (!issuedBy.equals(other.issuedBy))
			return false;
		if (issuedDate == null) {
			if (other.issuedDate != null)
				return false;
		} else if (!issuedDate.equals(other.issuedDate))
			return false;
		if (no == null) {
			if (other.no != null)
				return false;
		} else if (!no.equals(other.no))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	

}
