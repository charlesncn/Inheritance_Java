class car{
	int number;
	String manf;
	
	car(){
		number=32;
		manf="Bavarian";
	}
	void disp(){
		System.out.println("Production number: "+number+"\nManufacturer: "+manf);
	}
	
};
class suv extends car{
	private String model;
	private int price;
	
	suv(){
		model="BMW X6";
		this.price=340000;
	}
	void disp(){
		System.out.println("Model: "+model+"\nprice:  "+price);
	}
};


public class Main {
	public static void main(String[] args) {
		car bmw1= new car();
		suv bmw = new suv();
		bmw1.disp();
		bmw.disp();
		
		
	}
}
