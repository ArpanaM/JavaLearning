package basicsOfJava;

import java.util.Scanner;

public class EmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration
		Scanner x = new Scanner(System.in);
		int eno=1;
		String ename="riya";
		float sal=50000;
//		System.out.println("eno="+eno);
//		System.out.println("ename="+ename);
//		System.out.println("Salary="+sal);
		System.out.println("Enter eno");
		eno=x.nextInt();
		System.out.println("Enter ename");
		ename=x.next();
		System.out.println("Enter Salary");
		sal=x.nextFloat();
		System.out.println("eno="+eno+"\t"+"ename="+ename+"\t"+"Sal="+sal);
	}

}
