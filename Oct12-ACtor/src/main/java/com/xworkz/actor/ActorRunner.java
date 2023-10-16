package com.xworkz.actor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.ToString;

public class ActorRunner {

	public static void main(String[] args) {
		ActorDTO dto1=new ActorDTO(1, "Alu Arjun", "Telugu", "Male", "India");
		ActorDTO dto2=new ActorDTO(2, "Samantha", "Malayalam", "Female", "Brazil");
		ActorDTO dto3=new ActorDTO(3, "Mahesh Babu", "Telugu", "Male", "Germany");
		ActorDTO dto4=new ActorDTO(4, "Dhanush", "Tamil", "Male", "India");
		ActorDTO dto5=new ActorDTO(5, "Keerthi Suresh", "Malayalam", "Female", "USA");
		ActorDTO dto6=new ActorDTO(6, "Nivetha thomus", "Malayalam", "Female", "India");
		ActorDTO dto7=new ActorDTO(7, "Nani", "Telugu", "Male", "Swedan");
		ActorDTO dto8=new ActorDTO(8, "Aliya batt", "Hindi", "Female", "India");
		ActorDTO dto9=new ActorDTO(9, "Siddarth Malhothra", "Hindi", "Male", "India");
		ActorDTO dto10=new ActorDTO(10, "Kiara Advani", "Hindi", "Female", "India");
		
		Collection<ActorDTO> collection=new HashSet<ActorDTO>();
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
		
	System.out.println("--Actors desc order by name and print only name--");
	collection.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName())).collect(Collectors.toList()).forEach(e->System.out.println(e.getName()));
	System.out.println();
	
	System.out.println("Countries desc uppercase");
	collection.stream().sorted((c1,c2)->c2.getCountry().compareTo(c1.getCountry())).collect(Collectors.toList()).forEach(v->System.out.println(v.getCountry().toUpperCase()));
	System.out.println();
	
	
	
	System.out.println("---Id in Asc order---");
	List<Integer> collection3=collection.stream().map(e->e.getId()).sorted((a1,a2)->a1.compareTo(a2)).collect(Collectors.toList());
	collection3.forEach(v->System.out.println(v));
	System.out.println();
	
	System.out.println("--Actors asc order by language known--");
	collection.stream().filter(v->v.getLangKnown().equals("Telugu")).sorted((a1,a2)->a1.getName().compareTo(a2.getName())).collect(Collectors.toList()).forEach(v->System.out.println(v.getName()+"="+v.getLangKnown()));
	System.out.println();
	
	System.out.println("--Actors desc order by language known--");
	collection.stream().filter(v->v.getLangKnown().equals("Malayalam")).sorted((a1,a2)->a2.getName().compareTo(a1.getName())).collect(Collectors.toList()).forEach(v->System.out.println(v.getName()+"="+v.getLangKnown()));
	System.out.println();
	
	
	System.out.println("---Male actors---");
	collection.stream().filter(v->v.getGender().equals("Male")).forEach(v->System.out.println(v.getName()));
	System.out.println();
	
	System.out.println("---Female actors in desc---");
	collection.stream().filter(v->v.getGender().equals("Female")).sorted((b1,b2)->b2.getName().compareTo(b1.getName())).collect(Collectors.toList()).forEach(v->System.out.println(v.getName()));
	System.out.println();
	
	System.out.println("All countries count");
	Set<String> country=collection.stream().filter(v->v.getCountry()!=null).map(c->c.getCountry()).collect(Collectors.toSet());
	System.out.println(country+"="+country.size());
	System.out.println();
	
	System.out.println("---Id greater than 5 and sort ---");
	List<Integer> collection2=collection.stream().filter(v->v.getId()>5).map(e->e.getId()).sorted((c1,c2)->c1.compareTo(c2)).collect(Collectors.toList());
	collection2.forEach(v->System.out.println(v));
	}

}