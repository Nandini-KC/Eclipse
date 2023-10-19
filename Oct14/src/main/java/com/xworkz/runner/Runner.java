package com.xworkz.runner;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.tomcat.jni.Local;

import com.xworkz.countryDto.CountryDTO;
import com.xworkz.presidentDTO.PresidentDTO;
import com.xworkz.warDTO.WarDTO;

public class Runner {
	public static void main(String[] args) {
		PresidentDTO president1=new PresidentDTO(1,"Charkes michael" ,30 ,LocalDate.of(2014, 05, 22) ,LocalDate.of(2019, 10, 12));//belguim
		PresidentDTO president2=new PresidentDTO(2,"Christine lagarde" ,50 ,LocalDate.of(2011, 04, 18) ,LocalDate.of(2019, 06, 10) );
		PresidentDTO president3=new PresidentDTO(3," Recep Tayyip Erdoğan" ,45 ,LocalDate.of(2012, 10, 7) ,LocalDate.of(2017, 7, 19) );
		PresidentDTO president4=new PresidentDTO(4, "Fumio Kishida",34 ,LocalDate.of(2017, 10, 10) ,LocalDate.of(2022, 1, 1) );
		PresidentDTO president5=new PresidentDTO(5,"Andrés Manuel López Obrador" ,44 ,LocalDate.of(2011, 3, 11) ,LocalDate.of(2016,8,17) );
		PresidentDTO president6=new PresidentDTO(6,"Jair Bolsonaro" ,56 ,LocalDate.of(2002, 1, 13) ,LocalDate.of(2007, 9, 22) );
		PresidentDTO president7=new PresidentDTO(7, "Iván Duque",37 ,LocalDate.of(2005, 5, 23) ,LocalDate.of(2010,6,24 ) );
		PresidentDTO president8=new PresidentDTO(8,"Muhammadu Buhari" ,44,LocalDate.of(2012, 4, 23) ,LocalDate.of(2017, 7, 17));
		PresidentDTO president9=new PresidentDTO(9,"Cyril Ramaphosa" ,60 ,LocalDate.of(2013, 10, 2) ,LocalDate.of(2018, 11, 5) );
		PresidentDTO president10=new PresidentDTO(10," Mikhail Mishustin",44 ,LocalDate.of(2018, 8,18) ,LocalDate.of(2023, 12, 12));
		
		
		
		
		
		CountryDTO country1=new CountryDTO(1,"Belgium",president1,"Europe");
		CountryDTO country2=new CountryDTO(2,"France",president2,"Europe");
		CountryDTO country3=new CountryDTO(3,"Turkey",president3,"Asia");
		CountryDTO country4=new CountryDTO(4,"Japan",president4,"Asia");
		CountryDTO country5=new CountryDTO(5,"Mexico",president5,"North America");
		CountryDTO country6=new CountryDTO(6,"Brazil",president6,"South America");
		CountryDTO country7=new CountryDTO(7,"Colombia",president7,"South America");
		CountryDTO country8=new CountryDTO(8,"Nigeria",president8,"Africa");
		CountryDTO country9=new CountryDTO(9,"South Africa",president9,"Africa");
		CountryDTO country10=new CountryDTO(10,"Russia",president10,"Europe");
		
		Collection<CountryDTO> countries=new ArrayList<CountryDTO>();
		countries.add(country1);
		countries.add(country2);
		countries.add(country3);
		countries.add(country4);
		countries.add(country5);
		countries.add(country6);
		countries.add(country7);
		countries.add(country8);
		countries.add(country9);
		countries.add(country10);
		
		List<CountryDTO> collection1=new ArrayList<CountryDTO>();
		collection1.add(country1);
		collection1.add(country9);
		collection1.add(country7);
		collection1.add(country4);
		collection1.add(country5);
		
		List<CountryDTO> collection2=new ArrayList<CountryDTO>();
		collection2.add(country3);
		collection2.add(country2);
		collection2.add(country6);
		collection2.add(country8);
		collection2.add(country10);
		

		List<CountryDTO> collection3=new ArrayList<CountryDTO>();
		collection3.add(country1);
		collection3.add(country2);
		collection3.add(country3);
		

		List<CountryDTO> collection4=new ArrayList<CountryDTO>();
		collection4.add(country10);
		collection4.add(country9);
		collection4.add(country6);
		

		List<CountryDTO> collection5=new ArrayList<CountryDTO>();
		collection5.add(country3);
		collection5.add(country4);
		

		List<CountryDTO> collection6=new ArrayList<CountryDTO>();
		collection6.add(country1);
		collection6.add(country2);
		collection6.add(country3);
		

		List<CountryDTO> collection7=new ArrayList<CountryDTO>();
		collection7.add(country4);
		collection7.add(country5);
		collection7.add(country6);
		collection7.add(country7);
		
		List<CountryDTO> collection8=new ArrayList<CountryDTO>();
		collection8.add(country3);
		collection8.add(country10);
		
		List<CountryDTO> collection9=new ArrayList<CountryDTO>();
		collection9.add(country2);
		collection9.add(country10);
		collection9.add(country4);
		
		List<CountryDTO> collection10=new ArrayList<CountryDTO>();
		collection10.add(country5);
		collection10.add(country9);
		
		WarDTO war1=new WarDTO<CountryDTO>(1, LocalDate.of(1914, 7,28), LocalDate.of(1918, 11, 11),collection1,"UK" );
		WarDTO war2=new WarDTO<CountryDTO>(2,LocalDate.of(1939, 9, 01),LocalDate.of(1945, 07, 02) ,collection3 ,"France" );
		WarDTO war3=new WarDTO<CountryDTO>(3,LocalDate.of(1946, 10, 3) ,LocalDate.of(1948, 5, 17) ,collection2 ,"US" );
		WarDTO war4=new WarDTO<CountryDTO>(4,LocalDate.of(1819, 10, 10) ,LocalDate.of(1820, 12, 11) ,collection4 ,"US" );
		WarDTO war5=new WarDTO<CountryDTO>(5,LocalDate.of(1910, 4, 23) ,LocalDate.of(1917, 2, 10) ,collection5 ,"Germany" );
		WarDTO war6=new WarDTO<CountryDTO>(6,LocalDate.of(1716, 6, 21) ,LocalDate.of(1720, 10, 20) ,collection6 ,"Italy" );
		WarDTO war7=new WarDTO<CountryDTO>(7,LocalDate.of(1890, 8, 11) ,LocalDate.of(1910, 3, 22) ,collection7,"UK" );
		WarDTO war8=new WarDTO<CountryDTO>(8,LocalDate.of(1912, 10, 8) ,LocalDate.of(1918, 4, 1) ,collection8 ,"France" );
		WarDTO war9=new WarDTO<CountryDTO>(9,LocalDate.of(1810, 11, 5) ,LocalDate.of(1815, 2, 12) ,collection9 ,"Britain" );
		WarDTO war10=new WarDTO<CountryDTO>(10,LocalDate.of(1912, 7, 10) ,LocalDate.of(1916, 1, 2) ,collection10 ,"US" );
		
		Collection<WarDTO> wars=new HashSet<WarDTO>();
		wars.add(war1);
		wars.add(war2);
		wars.add(war3);
		wars.add(war4);
		wars.add(war5);
		wars.add(war6);
		wars.add(war7);
		wars.add(war8);
		wars.add(war9);
		wars.add(war10);
		
		
		System.out.println("---Presidents by country name---");
		wars.stream().filter(v->v.getCountries().equals(v.getCountries())).sorted().collect(Collectors.toList()).forEach(v->System.out.println(v));
		
		

		System.out.println("---Collect all presidents and print it---");
		Set<PresidentDTO> presidents=countries.stream().sorted().map(v->v.getPresident()).collect(Collectors.toSet());
		presidents.forEach(v->System.out.println(v.getName()));
		System.out.println();
		
		//List<WarDTO> president = wars.stream().flatMap(e -> e.getCountries().stream().map(v -> v.getPresident().getName())).collect(Collectors.toList());
		//president.forEach(v -> System.out.println(v));
		
		
		
		System.out.println("---All country and print it---");
		Set<String> country=countries.stream().sorted().map(v->v.getName()).collect(Collectors.toSet());
		country.forEach(v->System.out.println(v));
		System.out.println();
		
		System.out.println("---Collect by startdate and enddate---");
		Set<Collection> date=wars.stream().sorted().map(v->v.getCountries()).collect(Collectors.toSet());
		date.forEach(v->System.out.println(v));
		System.out.println();
		
		System.out.println("---Collect all by continent---");
		Set<String> continent=countries.stream().sorted().map(v->v.getContinent()).collect(Collectors.toSet());
		continent.forEach(v->System.out.println(v));
		
		
		
		
		
		
		
		
	}
}
