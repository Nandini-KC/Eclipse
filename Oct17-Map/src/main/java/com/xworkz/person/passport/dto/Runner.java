package com.xworkz.person.passport.dto;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {
		Date today=new Date();
		
		PersonDTO person1=new PersonDTO(1,"Nandini", "nandini123@gmail.com",8768909878L );
		PersonDTO person2=new PersonDTO(2,"Bindu", "bindu11@gmail.com",8900768923L );
		PersonDTO person3=new PersonDTO(3,"Thanusha", "thanusha234@gmail.com",63006789781L );
		PersonDTO person4=new PersonDTO(4,"Lahari", "laharid11@gmail.com",9887789800L );
		PersonDTO person5=new PersonDTO(5,"Chandana", "chandanad11@gmail.com",7800768923L );
		
		PassportDTO passport1=new PassportDTO(1,"J12393496",LocalDate.of(2017, 7, 7) ,"Ministry of external Affairs" ,LocalDate.of(2025, 11, 5) ,PassportType.PERSONAL );
		PassportDTO passport2=new PassportDTO(2, "ABA9875413", LocalDate.of(2012, 12,12), "US department",LocalDate.of(2018, 1, 8) , PassportType.EMIGRATION);
		PassportDTO passport3=new PassportDTO(3,"KH37382773", LocalDate.of(2010, 11, 10),"Ministry of external Affairs" , LocalDate.of(2025, 07, 10),PassportType.SERVICE );
		PassportDTO passport4=new PassportDTO(4, "US35467682", LocalDate.of(2023, 03, 3), "UK Department",LocalDate.of(2028, 10, 5) , PassportType.DIPLOMATIC);
		PassportDTO passport5=new PassportDTO(5, "JP83278736",LocalDate.of(2020, 12, 1), "US department",LocalDate.of(2019, 10, 7), PassportType.PERSONAL);
		
		Map<PersonDTO, PassportDTO> map=new HashMap<PersonDTO, PassportDTO>();
		map.put(person1, passport1);
		map.put(person2, passport2);
		map.put(person3, passport3);
		map.put(person4, passport4);
		map.put(person5, passport5);
		
		System.out.println("----Collect all personDTO----");
		List<PersonDTO> personDTO=map.keySet().stream().collect(Collectors.toList());
		personDTO.forEach(System.out::println);
		System.out.println();
		
		System.out.println("---Collect all passportDTO----");
		List<PassportDTO> passportDTO=map.values().stream().collect(Collectors.toList());
		passportDTO.forEach(System.out::println);
		System.out.println();
		
		System.out.println("---Collect passport by type---");
		List<PassportDTO> type=map.values().stream().filter(v->v.getType().equals(PassportType.PERSONAL)).collect(Collectors.toList());
		type.forEach(System.out::println);
		
		System.out.println("---Passport by issued date less than todays date and not expired ----");
		List<PassportDTO> passport=map.values().stream()
				.filter(v->
				v.getIssuedDate().isBefore(LocalDate.now())
				&& v.getExpireDate().isBefore(LocalDate.now()))
				.collect(Collectors.toList());
	
		passport.forEach(System.out::println);
		
		System.out.println("---expired passport---");
		List<PassportDTO> expired=map.values().stream().filter(v->v.getExpireDate().isBefore(LocalDate.now())).collect(Collectors.toList());
		expired.forEach(System.out::println);
		
		System.out.println("--get person by name---");
		Optional<PersonDTO> optional= map.keySet().stream().filter(person->person.getName().equals("Nandini")).findFirst();
		if(optional.isPresent())
		{
			 PersonDTO dto= optional.get();
			 System.out.println(dto);
		}
		
		System.out.println();
		System.out.println("---get passport by number---");
		Optional<PassportDTO> number=map.values().stream().filter(v->v.getNo().equals("ABA9875413")).findFirst();
		if(number.isPresent())
		{
			PassportDTO dto=number.get();
			 System.out.println(dto);
		}
		
	}

}





