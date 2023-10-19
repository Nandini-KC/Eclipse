package com.xworkz.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;



public class ProductRunner {

	public static void main(String[] args) {
		
		AddressDTO address1=new AddressDTO(1, 14, "Mico layout", "Banglore", "Karnataka", "517006");
		AddressDTO address2=new AddressDTO(2, 20, "Sundaraya street", "chittoor", "Andhra Pradesh", "517131");
		AddressDTO address3=new AddressDTO(3, 07, "LB puram", "Hyderabad", "Telangana", "518908");
		AddressDTO address4=new AddressDTO(4, 34, "Marthalli", "Banglore", "Karnataka", "517003");
		AddressDTO address5=new AddressDTO(5, 90, "Indiranagar", "Banglore", "Karnataka", "517010");
		
		BrandDTO brand1=new BrandDTO(1,"Ponds",123,address1,1960);
		BrandDTO brand2=new BrandDTO(2,"LG",908,address3,1940);
		BrandDTO brand3=new BrandDTO(3,"Redmi",100,address2,1997);
		BrandDTO brand4=new BrandDTO(4,"Butterfly",991,address4,2003);
		BrandDTO brand5=new BrandDTO(5,"American tourister",389,address5,2000);
		BrandDTO brand6=new BrandDTO(6,"IKEA",300,address2,2008);

		
		Collection<BrandDTO> brands=new ArrayList<BrandDTO>();
		brands.add(brand1);
		brands.add(brand2);
		brands.add(brand3);
		brands.add(brand4);
		brands.add(brand5);
		brands.add(brand6);
		
		
		ProductDTO product1=new ProductDTO("1", "Face Wash", Type.BEAUTY,  brand1,"200","1");
		ProductDTO product2=new ProductDTO("2", "Refrigerator", Type.ELECTRONICS,  brand2,"20000", "1");
		ProductDTO product3=new ProductDTO("3", "Rice Cooker", Type.KITCHEN_APP,  brand3,"4000","2");
		ProductDTO product4=new ProductDTO("4", "Dining Table", Type.FURNITURE,  brand6,"50000", "1");
		ProductDTO product5=new ProductDTO("5", "Eye Liner", Type.BEAUTY,  brand1,"180" ,"3");
		ProductDTO product6=new ProductDTO("6", "TV", Type.ELECTRONICS, brand3,"35000", "1");
		ProductDTO product7=new ProductDTO("7", "Gas Stove", Type.KITCHEN_APP,brand4,"8000", "1");
		ProductDTO product8=new ProductDTO("8", "Door", Type.FURNITURE,  brand6,"10000", "2");
		ProductDTO product9=new ProductDTO("9", "Bag", Type.TRAVEL, brand5,"2000","2");
		ProductDTO product10=new ProductDTO("10", "Washing Machine", Type.ELECTRONICS,  brand2,"25000", "1");
		
		Collection<ProductDTO> product=new HashSet<ProductDTO>();
		product.add(product1);
		product.add(product2);
		product.add(product3);
		product.add(product4);
		product.add(product5);
		product.add(product6);
		product.add(product7);
		product.add(product8);
		product.add(product9);
		product.add(product10);
		
		
		System.out.println("--All productDTO by pincode sort by desc--");
		List<ProductDTO> products=product.stream().sorted((m,n)->n.getBrand().getAddress().getPincode().compareTo(m.getBrand().getAddress().getPincode())).filter(v->v.getBrand().getAddress().getPincode().equals(v.getBrand().getAddress().getPincode())).collect(Collectors.toList());
		products.forEach(v->System.out.println(v));
		System.out.println();
		System.out.println("AddressDTO by product name sort by id desc");
		List<ProductDTO> name=product.stream().filter(v->v.getName().equals(v.getName())).sorted((m,n)->n.getId().compareTo(m.getId())).collect(Collectors.toList());
		name.forEach(v->System.out.println(v));
		System.out.println();
		System.out.println("Get brandDTO by productDTO");
		Set<BrandDTO> brand=product.stream().map(v->v.getBrand()).filter(v->v.getAddress().equals(v.getAddress())).collect(Collectors.toSet());
		brand.forEach(v->System.out.println(v));
		System.out.println();
		System.out.println("AddressDTO by BrandDTO");
		Set<AddressDTO> address=brands.stream().map(v->v.getAddress()).collect(Collectors.toSet());
		address.forEach(v->System.out.println(v));
		System.out.println();
		System.out.println("All productDTO by Max price");
		Optional<ProductDTO> max=product.stream().sorted((m,n)->n.getPrice().compareTo(m.getPrice())).findFirst();
		
		System.out.println(max);
		
		
		System.out.println();
		System.out.println("Product by type and sort by price desc");
		List<ProductDTO> type=product.stream().filter(v->v.getType().equals(Type.ELECTRONICS)).sorted((m,n)->n.getPrice().compareTo(m.getPrice())).collect(Collectors.toList());
		type.forEach(v->System.out.println(v));
		System.out.println();
		System.out.println("ProductDTO sorted by quantity in desc order");
		List<ProductDTO> quantity=product.stream().sorted((m,n)->n.getQuantity().compareTo(m.getQuantity())).collect(Collectors.toList());
		quantity.forEach(v->System.out.println(v));
		
		
		

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        //List Iterator
        ListIterator<String> listIterator = colors.listIterator();
        System.out.println("Forward Iteration:");
        while (listIterator.hasNext()) {
            String color = listIterator.next();
            System.out.println(color);
        }
        //Iterator
        java.util.Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }





	}

}
