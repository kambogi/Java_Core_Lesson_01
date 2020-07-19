package ua.lviv.lgs;

import java.util.Arrays;

public class application {
	public static void main(String[] args) {
		
		byte a = 4;
		short b = 35;
		int c = 15;
		long d = 9999;
		char i = 'h';
		float f = 9.3f;
		double g = -1.2;
		boolean e = true ;
		System.out.println("Byte MIN = " + Byte.MIN_VALUE);
		System.out.println("Byte MAx = " + Byte.MAX_VALUE);
		System.out.println("Short Min = " + Short.MIN_VALUE);
		System.out.println("Short Max = " + Short.MAX_VALUE);
		System.out.println("Int Min = " + Integer.MIN_VALUE);
		System.out.println("Int Max = " + Integer.MAX_VALUE);
		System.out.println("Long Min = " + Long.MIN_VALUE);
		System.out.println("Long Max = " + Long.MAX_VALUE);
		System.out.println("Char Min = " + Character.MAX_VALUE);
		System.out.println("Char Max = " + Character.MIN_VALUE);
		System.out.println("Float Min = " + Float.MIN_VALUE);
		System.out.println("Float Max = " + Float.MAX_VALUE);
		System.out.println("Double Min = " + Double.MIN_VALUE);
		System.out.println("Double Max = " + Double.MAX_VALUE);
		System.out.println("Boolean Min = " + Boolean.FALSE);
		System.out.println("Boolean Max = " + Boolean.TRUE);
		
int [] array = {230, 18, 78, 48, 99, 13, 3, 76, 789, 58, 600, 7, 222, 33};
		int max = array[0];
		int min = array[0];
		for (int k = 0; k < array.length; k++) {
			if(max < array[k])
				max = array[k];
			if(min > array[k])
				min = array[k];
		}
		System.out.println();
		System.out.println("Масив: " + Arrays.toString(array));
		System.out.println("Максимальне значення масива " + max);
		System.out.println("Мінімальне значення масива " + min);
	}
		

}
