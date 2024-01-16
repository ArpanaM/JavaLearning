package classesAndObjs;

public class MainLP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Laptop obj = new Laptop();
			float p=obj.getLaptopPrice();
			System.out.println("Laptop Price="+p);
			HP objHP = new HP();
			objHP.demo();
			System.out.println(objHP.getLaptopPrice());
			objHP.demo(10);
			objHP.test();
			
	}

}
