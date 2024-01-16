package basicsOfJava;

import java.util.ArrayList;

public class ArrayExpAndArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= {10,20,30,40,50};
//		System.out.println("Array Elements are=");
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		ArrayList<String> cNames = new ArrayList<String>();
		System.out.println("ArrayList size before storing elements-- "+cNames.size());
		cNames.add("Jack");
		cNames.add("Deepa");
		cNames.add("John");
		cNames.add("Pooja");
		System.out.println("ArrayList size after storing elements-- "+cNames.size());
		System.out.println("Array elements are=");
		for(int i=0;i<cNames.size();i++)
		{
			System.out.println(cNames.get(i));
		}
		cNames.add("diya");
		cNames.add(1,"George");
		System.out.println("Array elements are=");
		for(int i=0;i<cNames.size();i++)
		{
			System.out.println(cNames.get(i));
		}
		cNames.set(0, "Ravi");
		cNames.remove(4);
		System.out.println("Array elements are=");
		for(int i=0;i<cNames.size();i++)
		{
			System.out.println(cNames.get(i));
		}
		if(cNames.contains("Ravi897"))
		{
			System.out.println("Customer Name exists");
		}
		else
		{
			System.out.println("Customer Name doesnot exists");
		}
		
	}

}
