package com.xworkz.exception.app;

import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.image.ImagingOpException;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.invoke.WrongMethodTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.security.ProviderException;
import java.util.MissingResourceException;
import java.util.concurrent.CompletionException;

import javax.management.RuntimeErrorException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.TypeConstraintException;

import org.w3c.dom.ls.LSException;

public class Trips extends RuntimeException{

	public static void main(String[] args) {
		int i=20;
		if(i==1)
		{
			throw new WrongMethodTypeException();
		}
		else if(i==2)
		{
			throw new ArithmeticException();
		}
		else if(i==3)
		{
			throw new NegativeArraySizeException();
		}
		else if(i==4)
		{
			throw new IllegalArgumentException();
		}
		else if(i==5)
		{
			throw new ProviderException();
		}
		else if(i==6)
		{
			throw new MissingResourceException("hello","hi","how r u");
		}
		else if(i==7)
		{
			throw new AnnotationTypeMismatchException(null, null);
		}
		else if(i==8)
		{
			throw new ArrayStoreException();
		}
		else if(i==9)
		{
			throw new BufferOverflowException();
		}
		else if(i==10)
		{
			throw new BufferUnderflowException();
		}
		else if(i==11)
		{
			throw new CannotRedoException();
		}
		else if(i==12)
		{
			throw new CannotUndoException();
		}
		else if(i==13)
		{
			throw new ClassCastException();
		}
		else if(i==14)
		{
			throw new CMMException(null);
		}
		else if(i==15)
		{
			throw new CompletionException(null);
		}
		else if(i==16)
		{
			throw new TypeConstraintException("Hello guys");
		}
		else if(i==17)
		{
			throw new NullPointerException();
		}
		else if(i==18)
		{
			throw new ProfileDataException("printing message");
		}
		else if(i==19)
		{
			throw new IndexOutOfBoundsException();
		}
		else if(i==20)
		{
			throw new ImagingOpException("Printing exception");
		}
	}

}
