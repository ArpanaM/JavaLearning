package classesAndObjs;

public class Cube {
int l,b,h;
//method with no return type and no parameters
public void setData()
{
	l=10;
	b=10;
	h=10;
}
//method with return type and no parameters
public int dispCube()
{
	//System.out.println("Cube="+(l*b*h));
	return(l*b*h);
}
//method with no return type and with parameters
public void getDataFrmMain(int x,int y,int z)
{
	l=x;
	b=y;
	h=z;
	
}
//method with no return type and with parameters
public int getDataAndDispInMain(int x,int y,int z)
{
	l=x;
	b=y;
	h=z;
	return(l*b*h);
	
}

}
