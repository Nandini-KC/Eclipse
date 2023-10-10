package com.xworkz.movie;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MovieDTO implements Serializable{
	private int id;
	private String name;
	private Language lang;
	private String producer;
	private String director;
	private double budget;
}
