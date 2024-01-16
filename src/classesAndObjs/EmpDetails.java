package classesAndObjs;

public class EmpDetails {

	int eno;
	String ename;
	public EmpDetails()
	{
		System.out.println("Default Constructor..");
		eno=1;
		ename="jack";
	}
	public EmpDetails(int eno1,String ename1)
	{
		System.out.println("Parameterized Constructor..");
		eno=eno1;
		ename=ename1;
	}
	public void dispEmpDetails()
	{
		System.out.println("eno="+eno+"\t"+"ename="+ename);
		
	}
}
