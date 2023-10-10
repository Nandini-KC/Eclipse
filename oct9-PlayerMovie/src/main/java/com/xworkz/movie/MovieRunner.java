package com.xworkz.movie;

import java.util.Collection;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.xworkz.playerdto.PlayerDTO;

public class MovieRunner {

	public static void main(String[] args) {
		MovieDTO dto1=new MovieDTO(1, "RRR",Language.TELUGU, "Aravind", "Rajamouli", 11100000);
		MovieDTO dto2=new MovieDTO(2, "KGF",Language.KANADA, "Seetha ramaiah", "Rajamouli", 9000000);
		MovieDTO dto3=new MovieDTO(3, "Jailer",Language.TAMIL, "Raja sridhar", "dilipkumar", 6000000);
		MovieDTO dto4=new MovieDTO(4, "Baby",Language.HINDI, "Aravind", "Rajesh", 6000000);
		MovieDTO dto5=new MovieDTO(5,"Barbie",Language.ENGLISH,"Gerwig", "Greta", 7800000);
		MovieDTO dto6=new MovieDTO(6,"Kushi",Language.TELUGU, "Naveen Yerneni", "Shiva Nirvana", 81760000);
		MovieDTO dto7=new MovieDTO(7,"Jawan",Language.HINDI, "Gauri Khan", "Atlee", 3450000);
		MovieDTO dto8=new MovieDTO(8,"DADA",Language.TAMIL, "Ganesh ", "Babu", 7890000);
		MovieDTO dto9=new MovieDTO(9,"Seetha Ramam",Language.TELUGU, "Swapna", "Hanu Raghavapudi", 98000000);
		MovieDTO dto10=new MovieDTO(10,"Spider Man",Language.ENGLISH, "Thompson", "Justin", 2340000);
		
		Collection<MovieDTO> collection=new HashSet<MovieDTO>();
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
		System.out.println("--Movies by same language--");
		Collection<MovieDTO> collection1=new HashSet<MovieDTO>();
		collection.forEach((c)->{
			if(c.getLang().equals(Language.TELUGU))
			{
				collection1.add(c);
			}
		});
		collection1.forEach((v)->{
			System.out.println(v);
		});
		
		System.out.println("--Movies by same producer--");
		Collection<MovieDTO> collection2=new HashSet<MovieDTO>();
		collection.forEach((d)->{
			if(d.getProducer().equals("Aravind"))
			{
				collection2.add(d);
			}
		});
		collection2.forEach((l)->{
			System.out.println(l);
		});
		
		System.out.println("--Movies above 1 crore--");
		Collection<MovieDTO> collection3=new HashSet<MovieDTO>();
		collection.forEach((e)->{
			if(e.getBudget()>10000000)
			{
				collection3.add(e);
			}
		});
		collection3.forEach((vm)->{
			System.out.println(vm);
		});
			
		System.out.println("--- movies less than 1 crore---");
		Collection<MovieDTO> collection4=new HashSet<MovieDTO>();
		collection.forEach((p)->{
			if(p.getBudget()<10000000)
			{
				collection4.add(p);
			}
		
		});
		collection4.forEach((vm)->{
			System.out.println(vm);
		});
			
		java.util.Iterator<MovieDTO> iterator=collection.iterator();
		
		while(iterator.hasNext())
		{
			MovieDTO ele=iterator.next();
			if(ele.getBudget()<7800000)
			{
				System.out.println("Budget greater than 7800000 "+ele.getName());
				iterator.remove();
			}
		}
		
		
		collection.forEach((vm)->{
			System.out.println(vm);
		});
		
		
		
		
	}

}
