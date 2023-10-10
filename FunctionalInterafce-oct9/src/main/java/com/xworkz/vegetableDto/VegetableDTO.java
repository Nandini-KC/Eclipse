package com.xworkz.vegetableDto;

import java.io.Serializable;

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
public class VegetableDTO implements Serializable{
	private int id;
	private String name;
	private double price;
	private double weight;
}
