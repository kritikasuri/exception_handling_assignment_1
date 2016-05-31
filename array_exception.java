package com.acadgild.assignment.array.exception;

public class array_exception {
     public static void main(String[] args) {
		
    	int array[] = {1,2,3,4,5};
    	
    	try{
    		System.out.println("The 7th element of the array is : "+array[6]);
    	}
    	catch(ArrayIndexOutOfBoundsException e){
    		System.out.println("Array is out of Bounds "+e);
    	}
	}
}
