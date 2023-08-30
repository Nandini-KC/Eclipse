package com.xworkz.util.player;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PlayerDTO implements Serializable {
	private String name;
	private String sportName;


}
