package com.xworkz.util.movie;

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
public class MovieDTO implements Serializable {
	private String movieName;
	private String actorName;
	private int noOfHeros;
	private String actressName;

}
