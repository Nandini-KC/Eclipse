package com.xworkz.playerdto;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.movie.Language;

public class PlayerRunner {

	public static void main(String[] args) {
		
		PlayerDTO dto1=new PlayerDTO(1, "Dhoni", "India", Sport.CRICKET, 45);
		PlayerDTO dto2=new PlayerDTO(2, "Mary Kom", "India", Sport.BOXING, 50);
		PlayerDTO dto3=new PlayerDTO(3, "Saniya mizra", "India", Sport.TENNIS, 36);
		PlayerDTO dto4=new PlayerDTO(4, "Virat Kohli", "India", Sport.CRICKET, 28);
		PlayerDTO dto5=new PlayerDTO(5, "Zehra Güneş", "Turkey", Sport.VOLLEYBALL, 24);
		PlayerDTO dto6=new PlayerDTO(6, "Amjyot Singh", "Brazil", Sport.BASKETBALL, 30);
		PlayerDTO dto7=new PlayerDTO(7, " Vijay Amritraj ", "India", Sport.TENNIS, 69);
		PlayerDTO dto8=new PlayerDTO(8, "Shiva Thapa", "India", Sport.BOXING, 29);
		PlayerDTO dto9=new PlayerDTO(9, "Sophie Devine", "New zealand", Sport.CRICKET, 26);
		PlayerDTO dto10=new PlayerDTO(10, "Sergio Dutra ", "Brazil", Sport.VOLLEYBALL, 30);
		
		Collection<PlayerDTO> collection=new HashSet<PlayerDTO>();
		
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		System.out.println("---Players from same country---");
		Collection<PlayerDTO> collection1=new HashSet<PlayerDTO>();
		collection.forEach((c)->{
			if(c.getCountry().equalsIgnoreCase("India"))
			{
				collection1.add(c);
			}
		});
		collection1.forEach((x)->{
			System.out.println(x);
		});
		
		
		System.out.println("---Players from same sports---");
		Collection<PlayerDTO> collection2=new HashSet<PlayerDTO>();
		collection.forEach((d)->{
		if(d.getSport().equals(Sport.VOLLEYBALL))
		{
			collection2.add(d);
		}
		});
		collection2.forEach((x1)->{
			System.out.println(x1);
		});
		
		
		System.out.println("----Players age above 20 and below 30----");
		Collection<PlayerDTO> collection3=new HashSet<PlayerDTO>();
		collection.forEach((e)->{
		if(e.getAge()>20 && e.getAge()<30)
		{
			
			collection3.add(e);
		}
		});
		collection3.forEach((x2)->{
			System.out.println("Players age above 20 and below 30 :"+x2.getName()+"="+x2.getAge());
		});
		
		
		System.out.println("----Players above  30----");
		Collection<PlayerDTO> collection4=new HashSet<PlayerDTO>();
		collection.forEach((f)->{
			if(f.getAge()>30)
			{
				
				collection4.add(f);
			}
		});
		collection4.forEach((m)->{
			System.out.println("Players age above 30 :"+m.getName()+"="+m.getAge());
		});
	}

}
