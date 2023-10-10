package com.xworkz.grocery.dto;

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
public class GroceryDTO  implements Serializable{
	private String name;
	private double price;
	private String type;
	private double quantity;

}
