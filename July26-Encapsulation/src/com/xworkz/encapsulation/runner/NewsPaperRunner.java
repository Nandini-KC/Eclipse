package com.xworkz.encapsulation.runner;
import com.xworkz.encapsulation.app.*;
public class NewsPaperRunner {

	public static void main(String[] args) {
		NewsPaper news=new NewsPaper();
		System.out.println(news);
		
		news.setCost(2);
		news.setLanguage("Telugu");
		news.setName("Enadu");
		news.setPages(12);
		news.setType("Main paper");
		System.out.println(news);

	}

}
