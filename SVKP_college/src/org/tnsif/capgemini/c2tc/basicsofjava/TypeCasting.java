package org.tnsif.capgemini.c2tc.basicsofjava;

public class TypeCasting {

	public static void main(String[] args) {
		//implicit casting
		
		byte b = 127;
		int i = b;
		System.out.println(i);
		
		float f = 22.14f;
		double d = f;
		System.out.println(d);
		
		//Explicit casting
		
		double d1 = 10.52d;
		long l = (long)d1;
		System.out.println(l);
		
		float f1 = 34.56f;
		int li = (int)f1;
		System.out.println(li);

	}

}
