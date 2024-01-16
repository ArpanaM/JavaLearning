package classesAndObjs;

public class MainCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube obj = new Cube();
		obj.setData();
		int res=obj.dispCube();
		System.out.println("Cube(Main)="+res);
		obj.getDataFrmMain(20, 20, 20);
		res=obj.dispCube();
		System.out.println("Cube(Main)="+res);
		System.out.println(obj.getDataAndDispInMain(30, 30, 30));
	}

}
