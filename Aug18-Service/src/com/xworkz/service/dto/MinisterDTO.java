package com.xworkz.service.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MinisterDTO implements Serializable{
	private String name;
	private int experience;
	private String designation;
	private String partyName;

}
