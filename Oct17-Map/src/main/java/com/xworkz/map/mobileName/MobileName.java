package com.xworkz.map.mobileName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MobileName {
	public static void main(String[] args) {
		Map<Long, String> mobileAndName=new HashMap<Long, String>();
		mobileAndName.put(8142957868L,"Nandini");
		mobileAndName.put(9006784567L,"Ramyapriyasree");
		mobileAndName.put(7300579123L,"HimaBindu");
		mobileAndName.put(9876450934L,"HimaPriya");
		mobileAndName.put(6574839030L,"Ramesh kumar");
		mobileAndName.put(9099039029L,"Suresh");
		mobileAndName.put(7980384895L,"Gowtham");
		mobileAndName.put(8903498375L,"Manasa ");
		mobileAndName.put(8883883800L,"chandana Lahari");
		mobileAndName.put(9838743844L,"Thanusha Reddy");
		
		System.out.println("---Names with more than 10 characters---");
		List<String> name=mobileAndName.values().stream().sorted().filter(v->v.length()>10).collect(Collectors.toList());
		name.forEach(System.out::println);
		System.out.println();
		
		System.out.println("---Names with less than 10 characters---");
		List<String> names=mobileAndName.values().stream().sorted().filter(v->v.length()<10).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();
		
		System.out.println("---All names in uppercase---");
		List<String> uppercase=mobileAndName.values().stream().sorted().collect(Collectors.toList());
		uppercase.forEach(v->System.out.println(v.toUpperCase()));
		System.out.println();
		
		System.out.println("---Mobile number ends with zero---");
		mobileAndName.entrySet().stream().filter(v->v.getKey()%10==0).map(v->v.getKey()).forEach(System.out::println);
		System.out.println();
		
		System.out.println("---Mobile number starts with 8---");
		mobileAndName.entrySet().stream().filter(v->v.getKey().toString().startsWith("8")).map(v->v.getKey()).forEach(System.out::println);
		System.out.println();
		
				
				
		
	}
}
