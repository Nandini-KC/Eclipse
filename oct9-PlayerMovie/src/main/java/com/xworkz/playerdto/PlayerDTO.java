package com.xworkz.playerdto;

import java.io.Serializable;

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
public class PlayerDTO implements Serializable{
	private int id;
	private String name;
	private String country;
	private Sport sport;
	private int age;
	

}
