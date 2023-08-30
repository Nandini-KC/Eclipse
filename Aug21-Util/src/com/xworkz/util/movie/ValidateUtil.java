package com.xworkz.util.movie;

public class ValidateUtil {
	public static boolean validateString(String str) {
		if(str!=null && !str.isEmpty() && str.length()>=3 && str.length()<=30){
			return true;
		}
		else {
						}	
		return false;
	}
	
	public static boolean validateNumber(double d) {
		if(d>0 && d<500) {
			return true;
		}
	else {
			}
		return false;
}
}
