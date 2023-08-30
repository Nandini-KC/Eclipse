package com.xworkz.crud.app;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PrimeMinisterDTO implements Serializable{
	private int id;
	private String name;
	private String country;
	private String partyName;

}
